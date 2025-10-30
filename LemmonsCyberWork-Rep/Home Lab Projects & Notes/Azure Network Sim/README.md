# Azure Enterprise Network Simulation

## Overview

This project involved designing and deploying a simulated enterprise network environment using Microsoft Azure. The goal was to demonstrate core cloud networking, security, and infrastructure components in a secure and isolated lab. The lab was built using an **Azure for Students** subscription and served as a practical exercise in enterprise-grade cloud architecture, including segmentation, firewalling, and controlled access via bastion and routing tables.

> ⚠️ Note: This lab was conducted using a temporary free-tier subscription which has since expired. Resources and configurations were removed as part of the subscription's deletion policy.

---

## Architecture Summary

The simulated environment mimicked a small to medium sized buisiness (SMB) enterprise network consisting of the following Azure components:

### **Resource Group**
- **`rg-enterprise-demo`**: The container for all deployed resources related to the simulation. This helped manage billing, access, and deployment as a single unit.

### **Networking Components**
- **`vnet-enterprise`**: A virtual network (VNet) used to segment and isolate different subnets and resources.
- **`rt-firewall`**: A custom route table to direct internal traffic through a centralized firewall, enforcing segmentation and egress/ingress rules.
- **`fw-pip`**: A dedicated public IP address associated with the enterprise firewall for external access.

### **Firewall and Security**
- **`enterprise-fw`**: Azure Firewall resource acting as a centralized security barrier for both ingress and egress traffic. This enforced L3-L7 policies across subnets.
- **`Default` Firewall Policy**: Applied to `enterprise-fw` to define NAT, network, and application rules.
  
### **Virtual Machines**
- **`vm-internal1`**: Internal server VM simulating backend infrastructure (e.g., internal app server or domain controller).
- **`vm-honey`**: A honeypot virtual machine, possibly configured with lightweight bait services to simulate an attractant for unauthorized access—useful for learning threat detection or behavioral logging.

### **Access and Management**
- **`bastion-host`**: Azure Bastion service for secure, agentless RDP/SSH access to VMs without exposing them to the public internet.

---

## Key Skills Demonstrated

- **Azure Resource Group Management**
- **Virtual Network Design & Subnetting**
- **Firewall Configuration and Policy Management**
- **Virtual Machine Deployment and Role Assignment**
- **Secure VM Access via Bastion**
- **Custom Routing and IP Address Management**
- **Cloud Cost Awareness via Free-Tier Optimization**

---

## Lessons Learned

- Azure Firewall is powerful, but incurs cost even in the free tier once traffic scales.
- Bastion provides a clean and secure method to manage VMs without punching holes in NSGs.
- Always document your work! Screenshots and post-mortems become invaluable when subscriptions expire or resources are lost.

---

## Future Improvements

If recreated or scaled up, the following additions would improve realism and complexity:

- Integration with **Azure Active Directory** for centralized identity.
- Use of **Network Security Groups (NSGs)** alongside the firewall for layered defense.
- Deployment of **Log Analytics Workspace** and **Azure Sentinel** for monitoring.
- Creation of automated deployment scripts via **ARM templates** or **Terraform**.

---

## Closing Thoughts

Though temporary, this simulation was an eye-opener into cloud-native network security and infrastructure. It served as an ideal sandbox to test enterprise architecture principles in a low-cost environment. Projects like this solidify your understanding of Azure’s ecosystem and are excellent material for resumes and interviews.

