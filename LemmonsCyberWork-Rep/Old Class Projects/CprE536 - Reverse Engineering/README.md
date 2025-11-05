# CprE 536 – Reverse Engineering and Malware Analysis

## Assignment 4 – Malware Analysis with OllyDbg and Ghidra

**Objective:** Analyze the executable `Lab09-01.exe` to determine its installation behavior, command-line options, and password validation logic using **OllyDbg** and **Ghidra**.

### Overview
This assignment involved performing both static and dynamic analysis on a Windows malware sample. The goal was to reverse engineer its functionality, identify how it installs itself, and uncover hidden command-line arguments and password requirements.

### Key Findings
- The malware installs itself when executed with the `-in` flag and a valid password string.  
- The correct password is **`abcd`**.  
- Supported command-line options include `-in`, `-re`, `-c`, and `-cc`.  
- The binary’s logic flow and string references were verified through disassembly and debugging.

### Tools Used
- **Ghidra** – for static disassembly and control flow analysis  
- **OllyDbg** – for runtime tracing and breakpoint inspection  

### Skills Demonstrated
- Reverse engineering of compiled binaries  
- Static and dynamic malware analysis  
- x86 assembly interpretation  
- Debugger usage and behavioral mapping  

---

> This analysis demonstrated practical reverse engineering workflow and malware behavior identification using professional-grade tools.