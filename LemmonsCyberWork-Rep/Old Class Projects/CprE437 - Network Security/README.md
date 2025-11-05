# ISU 437 Network Security Labs

## Overview
This repository contains recovered lab projects from ISU course **CprE 437 / Network Security**. The labs focus on practical network and wireless security concepts including **Man-in-the-Middle attacks**, **ARP spoofing**, and **Bluetooth reconnaissance** using Kali Linux tools and real-world testbeds.

---
## Lab 2 — Man-in-the-Middle (On-Path) Attack

### Objective
Demonstrate how a malicious actor (Mallory) can intercept communication between two nodes (Alice and Bob) using **ARP spoofing** in a controlled network testbed (ORBIT). The lab compares the exposure of sensitive information across multiple protocols: **FTP**, **SFTP**, **Telnet**, and **SSH**.

### Summary
- Configured multiple wireless nodes and servers  
- Executed ARP poisoning with **Ettercap** to intercept traffic  
- Captured and analyzed packets for different communication protocols  

### Key Findings
| Protocol | Encryption | Data Visibility | Security Assessment |
|-----------|-------------|----------------|---------------------|
| FTP | None | Credentials and data visible | Insecure |
| SFTP | SSH tunneling | Encrypted | Secure |
| Telnet | None | Commands and credentials visible | Insecure |
| SSH | Encrypted | Session data protected | Secure |

**Conclusion:** Encrypted protocols (SSH, SFTP) protect data and credentials from interception, while unencrypted ones (FTP, Telnet) are highly vulnerable to MITM attacks.

---
## Lab 3 — Bluetooth Security Reconnaissance

### Objective
Explore Bluetooth security features and vulnerabilities using **Kali Linux** tools such as `hciconfig`, `hcitool`, `sdptool`, and **Wireshark**. Learn to identify, scan, and analyze Bluetooth devices while understanding risks like device tracking and BLE exploitation.

### Summary
- Scanned for nearby Bluetooth devices and analyzed adapters  
- Explored service discovery with `sdptool` and device info via `hcitool`  
- Attempted device pairing and packet capture  
- Researched the **BIAS (Bluetooth Impersonation AttackS)** vulnerability  

### Key Concepts
- Bluetooth frequency hopping and MAC randomization  
- Vulnerable services: **OBEX**, **SPP**, **Headset Profile**, **Device ID Profile**  
- BIAS attack allows impersonation and unauthorized connections on affected BLE devices  

**Conclusion:** Practical exploration of Bluetooth protocols shows how security features like encryption and randomization protect against tracking and exploitation. Hands-on testing revealed how complex wireless security enforcement is in modern devices.

---
