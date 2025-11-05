Date: Oct 30 2025  

**Key Takeaways**  

- MCP is a client‑server architecture that lets large language models invoke external services via JSON‑RPC.  
- The protocol was introduced by Anthropic in Nov 2024 and now has an SDK that supports dozens of languages (Python, TypeScript, Java, Go, Ruby, PHP, etc.).  
- Documentation is hosted at modelcontextprotocol.io and the reference implementation lives on GitHub.  

**Security Landscape**  

- Recent testing shows 43 % of early MCP deployments contain command‑injection flaws.  
- Additional findings: path traversal, SSRF, tool‑poisoning, identity spoofing, over‑privileged tools and lack of logging.  
- Credentials are often hard‑coded or placed in prompt templates, exposing them to prompt‑injection attacks.  

**Mitigation Strategies**  

- Run local MCP servers bound to localhost or Unix domain sockets; avoid open network ports.  
- Validate and sanitize every input: prompts, API parameters, file paths, SQL statements.  
- Apply chroot‑style file‑system restrictions to limit access.  
- Store secrets in external vaults (HashiCorp Vault, cloud KMS); never embed them in code or prompts.  
- Implement comprehensive logging that records actions but redacts tokens and passwords.  
- Enforce rate limits on API calls and monitor DNS for calls to unknown endpoints.  

**Tools & Resources**  

- MCP Safety Scanner (AI Assurance Lab) – static and dynamic analysis.  
- MCP Guardian – policy enforcement and OAuth 2.0 integration.  
- Cisco MCP Scanner – YARA‑based vulnerability detection.  
- Proximity (Thomas Rakia) – security scanner that maps tools, prompts and resources.  
- “Damn Vulnerable MCP Server” on GitHub – sandbox for testing attack scenarios.  

**Standards & Extensions**  

- OAuth 2.0‑based MCP authorization (RFC 9728) introduces resource and authorization server separation, enabling least‑privilege tool access.  
- Anthropic’s “Skills” feature (released Oct 16) packages resources and code in a file‑system layout, reducing token usage while preserving the same risk profile.  

**Practical Recommendations for Deployment**  

1. Use Unix domain sockets or localhost bindings for local servers.  
2. Adopt strict input validation across all request vectors.  
3. Implement chroot‑style isolation for file access.  
4. Centralize secret management in a vault solution.  
5. Add structured logging; ensure logs do not contain sensitive material.  
6. Rate‑limit and monitor outbound connections, especially DNS queries to AI provider endpoints.   

**Personal Reflection**  

Attending the Antisyphon webinar deepened my understanding of how agentic AI expands the attack surface. The emphasis on securing the scaffolding (the servers, prompts and toolchains) resonated with my experience in traditional web‑app hardening. I plan to incorporate the mitigation checklist into my security assessments and share the tools with my team.  

**Portfolio Note**  

- Demonstrated knowledge of MCP architecture, associated risks and mitigation techniques.  
- Evaluated and tested open‑source security scanners for MCP.  
- Integrated OAuth 2.0 authorization concepts into a proof‑of‑concept MCP deployment.  

These notes capture the technical depth of the session and illustrate my capability to assess and secure emerging AI integration points.