#### _“One of the only crimes you take credit for.”_

---
### 1. The Big Players
#### A. Conti
- **Corporate Structure**  
	- Operated like a full-fledged business:  
		- Dedicated development team (writing/updating the ransomware)  
		-  Help desk (support for affiliates)  
		-  HR & Payroll (managing payouts)
- **Scale & Impact**  
	- Over **1,000 documented infections**  
	-  Collected **$150 million+** in cryptocurrency
- **Conti Leaks**  
	-  After publicly backing Russia post-Ukraine invasion, Ukrainian insiders rebelled  
	- Resulted in massive internal data dumps (source code, chat logs, credentials)
#### B. LockBit
- **Cartel Ambitions**  
	-  Attempted to unite multiple groups under a “ransomware cartel” to share:  
		- Code  
		-  Affiliates  
		-  Extortion tactics
- **Technical Edge**  
	- Super fast encryption (often completed before defenders realize something’s happening)
- **Marketing & Branding**  
	- Known for bold stunts (affiliate tattoos)  
	- Ran “bug bounty” programs on their own ransomware to crowdsource vulnerabilities
- **Enterprise-First Focus**  
	- Designed to infiltrate entire networks (not just single endpoints)  
	- Encrypt servers & exfiltrate mass data before locking systems
---
### 2. Bassterlord (LockBit Affiliate)
- **Origin Story**  
	- Joined LockBit to help pay for his sick mother’s medical bills
- **Contributions**  
	-  Authored extensive Russian based manuals covering:  
	      - Setting up Kali Linux VMs  
	      - Using post-exploitation tools like Mimikatz, EternalBlue, Cobalt Strike  
	- Essentially taught newcomers how to become effective ransomware operators
---
### 3. Ransom Negotiations & RansomChat
- **RansomChat Simulation (AI Bot)**  
	- Leverages real chat logs from Conti, LockBit, REvil, etc.  
	- Behaves like a negotiation partner
    - complete with pressure techniques, “soft clocks” vs. countdown timers
- **Key Differences: Conti vs. LockBit**

| Aspect                  | Conti                                            | LockBit                                                          |
| ----------------------- | ------------------------------------------------ | ---------------------------------------------------------------- |
| **Tone**                | More “professional”                              | Aggressive & manipulative                                        |
| **Payment Flexibility** | High initial ask, then willing to negotiate down | Base demands strictly on company revenue; less room for haggling |
| **Clock Strategy**      | “Soft clock” approach (flexible deadlines)       | Classic countdown timer to create urgency                        |
- **GitHub (RansomChat)**  
	- **Link:** [https://github.com/toniall/ransomchat](https://github.com/toniall/ransomchat)  
	- Implements behavioral + physiological models from real negotiations
---
### 4. Modern Threat Landscape
#### A. Enterprise-First Evolution
- **Network-Wide Infiltration**  
	- Attackers now focus on compromising entire environments (not single endpoints).  
	- They exfiltrate mass data from servers, then encrypt (maximizing leverage).
#### B. Emerging/Rising Ransomware Families
- **RansomLook…**  
	- (New player with fast-moving development; keep an eye out for its extortion site.)
- **Madusa**  
	- (Surfaced recently; notable for aggressive network pivot techniques.)
- **QILIN**  
	- (Advertises “double extortion” auctions; steals data for auction if no ransom paid.)
- **RansomHub** (No longer active)  
	- (Was a marketplace for lesser-known affiliates; now defunct but spawned copycats.)
#### C. “Ads on the Dark Web”
- **Open Recruiting**  
	- Multiple modern groups (e.g., QILIN, RansomLook) literally place recruitment ads on dark-web forums.  
	- These ads pitch “easy money,” advertise affiliate payouts, and promise “toolkits for beginners.”
---
### 5. Takeaways 
1. **Professionalization of Ransomware**
    - Conti’s corporate-style structure and LockBit’s cartel model show how mature and business-like these outfits have become.
2. **Emerging Threat Actors**
    - New families (Madusa, QILIN, RansomLook) are rapidly innovating; watch their dark-web ads and auction sites for signs of the next big strain.
3. **Negotiation Psychology Matters**
    - Knowing whether a group uses a “soft clock” (Conti) or a hard countdown timer (LockBit) can shape your incident response and negotiation approach.
4. **Branding as a Weapon**
    - LockBit’s public bug bounties and affiliate tattoos demonstrate that marketing itself can be a force multiplier (for recruitment and intimidation).
5. **RansomChat Project**
    - A valuable tool to simulate real-world negotiations; helps defenders train on attacker psychology and pressure techniques.




