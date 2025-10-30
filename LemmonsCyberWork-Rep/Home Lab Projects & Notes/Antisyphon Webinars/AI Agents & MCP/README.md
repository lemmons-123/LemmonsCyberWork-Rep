```markdown
# Model Context Protocol (MCP) – Security and Deployment Notes

This notesheet summarizes insights from the Anti-Siphon webinar on the Model Context Protocol (MCP), focusing on its architecture, security challenges, and best practices for safe deployment in AI-integrated environments.

## Key Topics Covered:
- Overview of MCP as a client–server protocol enabling LLMs to call external services via JSON‑RPC  
- Security flaws in early deployments: command injection, SSRF, path traversal, and credential exposure  
- Mitigation strategies including local bindings, strict input validation, and secret vaulting  
- Tools and scanners for MCP vulnerability assessment  
- OAuth 2.0 authorization and Anthropic’s “Skills” extension for structured tool packaging  

## Tools Mentioned:
- MCP Safety Scanner (AI Assurance Lab)  
- MCP Guardian  
- Cisco MCP Scanner  
- Proximity (Thomas Rakia)  
- Damn Vulnerable MCP Server  

## Practical Recommendations:
- Bind MCP servers to localhost or Unix domain sockets  
- Sanitize all inputs and enforce chroot‑style isolation  
- Store secrets in vaults such as HashiCorp Vault or cloud KMS  
- Implement structured logging and redact sensitive data  
- Rate‑limit and monitor outbound connections  

---
```