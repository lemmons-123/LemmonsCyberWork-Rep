# Hacking JavaScript Desktop Apps with XSS and RCE

This folder contains notes from the **Antisyphon Training** webinar *Hacking JavaScript Desktop Apps with XSS and RCE*, presented by **Abraham Aranguren**, CEO of *So Many Security*.

---

## Overview

**Topic:** Exploiting JavaScript desktop applications built with **Electron**, focusing on **cross-site scripting (XSS)** and **remote code execution (RCE)**.  
**Resources:** Vulnerable apps, slides, and labs available at [70security.com/free](https://70security.com/free).

---

## Key Concepts

- **Electron Architecture:**  
  - Main process: privileged, launches renderer processes, accesses Node APIs  
  - Renderer process: sandboxed UI layer with limited API surface  
  - IPC: communication bridge between main and renderer, common attack vector  

- **Auditing Workflow:**  
  1. Inspect `package.json` to locate the main entry point  
  2. Review `webPreferences` in `BrowserWindow`  
     - `nodeIntegration` should be **false**  
     - `contextIsolation` should be **true**  
  3. Run `npm audit` to identify vulnerable dependencies  

- **Attack Surface:**  
  - Insecure IPC channels  
  - Unsanitized user input leading to XSS  
  - Misconfigured Node.js integration enabling RCE  

---

## Skills Reinforced

- Secure Electron app auditing  
- Identifying XSS and RCE vectors in hybrid desktop apps  
- Reviewing JavaScript configurations for security missteps  
- Applying secure coding practices in Node.js environments  

---

> This session provided practical insight into auditing and securing modern JavaScript desktop applications against common exploitation paths.