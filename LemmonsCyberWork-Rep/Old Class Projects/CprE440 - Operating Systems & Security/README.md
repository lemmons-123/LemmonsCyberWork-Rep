# CprE 440 – Operating Systems and Security

This folder contains recovered projects from *CprE 440: Operating Systems and Security* at Iowa State University. The course focused on kernel-level programming, process management, and secure system design in Linux and microkernel environments.

---

## Project 1 – Linux Security Module (cwLite)

**Objective:** Implement a simplified Linux Security Module (LSM) enforcing basic authorization and filtering.  
**Highlights:**  
- Developed the `has_perm` function for access control decisions  
- Integrated filtering logic into the cwLite framework  
- Debugged kernel compilation and runtime errors  

**Skills:** Kernel C programming, system call interception, access control logic  

---

## Project 2 – Client-Server Communication

**Objective:** Build a multi-client server system in C using TCP sockets.  
**Highlights:**  
- Implemented `client1.c`, `client2.c`, and `server.c` for concurrent communication  
- Practiced synchronization and error handling  
- Demonstrated interprocess communication and message integrity  

**Skills:** Socket programming, concurrency, network reliability  

---

## Project 3 – seL4 Capabilities and Access Control

**Objective:** Implement and test capability-based access control in the **seL4 microkernel**.  
**Highlights:**  
- Manipulated capabilities through the seL4 API to explore microkernel security  
- Calculated CSpace size and managed capability slots  
- Implemented error handling and verification for capability operations  
- Demonstrated secure resource isolation and access enforcement  

**Skills:** Microkernel programming, capability-based security, low-level memory management  

---

> These projects collectively demonstrate proficiency in operating system internals, kernel security, and secure process communication — foundational for endpoint defense and OS-level cybersecurity work.