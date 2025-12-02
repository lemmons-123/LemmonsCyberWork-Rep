## History: AD -> SSO -> Entra ID

- AD launched ~2000 to let users log into PC and then all company resources
- Kerberos tickets enable single sign‑on across file shares, printers, apps
- Group Policy pushes settings to domains/OUs, made Microsoft the infra leader
- 2001: Microsoft Passport (later Windows Live ID → Microsoft Account) for web apps like Hotmail & Xbox
- ADFS added claim‑based access; later OAuth unified SSO across Google, Twitter, Yahoo
- Azure AD renamed Entra ID; sync lets on‑prem AD mirror to cloud
- Conditional Access, Privileged Identity Management (PIM) and admin‑consent introduced as zero‑trust foundations

## Active Directory Basics

- Centralized directory of **objects**: domains → forests → OUs (Org Units) → groups, computers, users, GPOs
- Domain Controllers store the NTDS.dit DB; authentication uses NTLM & Kerberos
- OU = container for groups/GPOs; groups = collections of users/computers
- Tiered model: Tier 0 (DCs, admins), Tier 1 (servers), Tier 2 (workstations/users)
- Proper tiering limits privileged accounts to their own layer

## Enterprise Access Model & Tiering

- Tier 0: DCs, Domain Admins, AD Connect, any account that can control the whole forest
- Tier 1: Server admins, service accounts for critical servers
- Tier 2: Regular user workstations and accounts

- Enforce with **User Rights Assignments** (GPO) and VLAN segmentation where possible
- Avoid using the same admin account for daily tasks; give separate “IT admin” accounts

## Common AD Misconfigurations

- **SPNs** attached to Tier 0 accounts → Kerberos‑ticket abuse (Kerberoasting)
- Unconstrained delegation on servers → attackers can impersonate any user
- Print Spooler enabled on DCs (PrintNightmare)
- SMBv1 still running on DCs, especially in legacy medical devices
- Domain admins using vulnerability scanners (e.g., Tenable) with full credentials → credential sprawl
- Default “Add users to Domain Admins” rights, DC sync rights granted to non‑admin accounts
- Stale passwords for privileged accounts (some older than interns)

## AD Attack Techniques & Mitigations

- **Kerberoasting**: request all SPNs, extract NTLM hashes, crack, then log in as privileged user
    - Mitigate: limit SPNs on Tier 0, use Managed Service Accounts with strong passwords, monitor with Defender for Identity
- **Mimikatz**: dumps LSASS credentials; protect with Credential Guard, Protected Users, reduce cached credentials, remove SeDebugPrivilege where feasible
- **Unconstrained Delegation**: switch to Constrained Delegation, mark sensitive accounts “Account is sensitive and cannot be delegated”
- **Certificate Services abuse**: rogue enrollment can grant domain‑admin rights; regularly audit certificates (e.g., with Certify) and require manager approval
- **GPO write permissions**: prevent users from editing GPOs that apply to DCs or privileged groups

## Entra ID (Azure AD) Essentials & Security

- Identity provider that syncs on‑prem AD users to the cloud
- Conditional Access policies enforce MFA, device compliance, location, risk signals
- MFA options: passwordless, phishing‑resistant, standard OTP (aim for passwordless where possible)
- PIM provides just‑in‑time elevation (eligible vs. active roles); audit active privileged roles regularly
- App registration abuse: protect secrets, limit admin consent, apply workload‑level Conditional Access
- MFA bypass tricks: phishing kits, persistent auth cookies (≈90‑day lifespan), “trusted location” VPN loopholes, anti‑detect browsers
	- tighten sign‑in frequency and block legacy protocols

## AI Agents & Future Outlook

- Microsoft’s “frontier firms” let AI agents manage marketing, HR, etc., using Entra’s backbone
- New agents (e.g. Conditional Access Optimizer) can surface policy gaps but add attack surface – audit and restrict their permissions
- Expect more AI driven credential‑harvesting tools; keep monitoring for anomalous AI activity

## Flare Identity Exposure Management (offered solution)

- Dark‑web credential discovery for Entra tenants; auto‑test validity and suggest remediation
- Identity profiles map user blast radius, flag leaked persistent auth cookies (≈9.7 M found)
- Provides actionable steps: password rotation, MFA enforcement, credential revocation, and threat‑intel chatter review

---
**Key takeaways**

- Keep AD tiering strict; limit privileged accounts and their SPNs
- Regularly audit delegation, certificates, GPO edits, and legacy protocols
- Leverage Conditional Access Optimizer and strong MFA to harden Entra ID
- Monitor for AI‑related permissions and dark‑web credential exposure with tools like Flare.