## Overview  
- Topic: hacking JavaScript desktop apps (Electron) – XSS and remote code execution  
- Presenter: Abraham Aranguran, CEO of So Many Security (free labs at **70security.com/free**)  

## Electron Architecture  
* Main process – privileged, launches renderer processes, accesses Node APIs  
* Renderer process – UI, sandboxed, limited API surface  
* IPC – communication bridge between main and renderer, common attack vector  

## Auditing Workflow  
1. Open **package.json** → locate `main` entry point  
2. Review `webPreferences` in `new BrowserWindow`  
   - `nodeIntegration` should be **false**  
   - `contextIsolation` should be **true**  
3. Run `npm audit` → generate JSON report, identify vulnerable dependencies  
4. Use **Electronegativity** (`npm i -g electronegativity`) → quick config/security hints  

## Common Vulnerabilities Demonstrated  

### Node Integration Enabled  
* Allows XSS to call `require` → `child_process.exec` → OS commands (calc, id, ls)  

### Context Isolation Disabled  
* Preload script shares context with page scripts  
* Prototype pollution can modify array methods, bypass checks  

### Unsafe DOM Manipulation  
* `innerHTML` used for user messages → DOM‑based XSS  

### Insecure IPC Exposures  
* Renderer calls `window.electron.send` → main process runs privileged code (download, execute)  

## Exploit Techniques  

### XSS → RCE  
* Inject `<img src=x onerror=alert(1)>` to force re‑render, trigger script execution  
* Use `require('child_process').exec('calc')` for Windows, `id` or `ls` for Linux  

### Preload Script Attack  
* Array prototype `indexOf` polluted to always return a valid index  
* Bypasses safe protocol check (`http`, `https`) in `shell.openExternal`  
* Opens `file:` URLs, can launch malicious JAR on Windows → remote code execution without warnings  

### IPC Based Remote Execution (Vulnerable 3 demo)  
* XSS calls `window.electron.send('getUpdate', maliciousURL)`  
* Main process downloads file, sets exec permission, runs it → reverse shell  

## Mitigation Checklist  

* Set `nodeIntegration: false` in all windows  
* Enable `contextIsolation: true`  
* Apply a strict Content Security Policy (`default-src 'self'`, block inline scripts)  
* Replace `innerHTML` with `textContent` or sanitize with **DOMPurify**  
* Whitelist allowed HTML tags when rich‑text is required  
* Review and limit IPC channels, validate all data before invoking main‑process functions  

## Tools & Commands  

```bash
# Install dependencies
npm install

# Run security audit
npm audit --json > audit-report.json

# Install Electronegativity
npm i -g electronegativity

# Scan app
electronegativity .

# Start vulnerable demo app
npm start
```
## Quick Reference  

| Setting | Secure Value | Risk if Mis‑configured |
|---------|--------------|------------------------|
| `nodeIntegration` | false | XSS → Node API → RCE |
| `contextIsolation` | true | Preload script shares context, prototype pollution |
| CSP | strict, no `'unsafe-inline'` | Inline script execution |
| IPC | whitelist, validate | Arbitrary main‑process calls |
| DOM handling | `textContent` or sanitized HTML | XSS via `innerHTML` |