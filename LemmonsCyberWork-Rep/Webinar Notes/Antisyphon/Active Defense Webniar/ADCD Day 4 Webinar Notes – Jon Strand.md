#### **Theme:** Legal, Ethical, and Practical Aspects of Cyber Deception

## **Pt.1: Legal & Ethical Foundations**
### Case Studies
- **Jerome Hackenkamp**    
    - University IT admin accessed a student’s computer without a warrant.        
    - Court ruled it legal due to:        
        - University’s terms of use.            
        - No access to personal files.            
        - Emergency circumstances.            

- **Susan Clements Jeffrey**    
    - Her stolen computer was tracked by Absolute Software.        
    - Court ruled interception of personal communications was **illegal**, emphasizing digital rivacy rights even for stolen property.      
### Principles for Legal Cyber Response
- **Don’t commit crimes to catch criminals**.    
- Focus on **tracking, not retaliation**.    
- Avoid hot-button phrases like “hacking back.”    
- **Transparency and documentation** are critical.    
- Think of it as a **defense**, not revenge.    
- Keep stakeholders informed (e.g., legal, leadership, law enforcement).    

## **Pt.2: Cyber Deception and Attribution**
### Active Defense ≠ Strike Back
- Use **“poison” not “venom”** – defensive, not offensive.    
- Must stay inside legal boundaries when building deception.   
### Technical Approaches
- Canary tokens    
- Web bugs    
- Fake login portals    
- Geolocation tricks (router edge IP, wireless triangulation)    

## **Lab 1: Working with Canary Tokens**
### Objective
- Detect intrusions through **embedded tokens** in documents or URLs.
### Tools and Techniques
- **Canary Tokens** (e.g., document, URL, DNS)
![[Pasted image 20250619121301.png]]
- Embed in sensitive-looking files or links    
- Trigger sends data (IP, timestamp, device info)
### Use Case
- Detect unauthorized access.
![[Pasted image 20250619121018.png]]
- Great for phishing detection, insider threat monitoring, or penetration testing.    
- No macros needed – functional in Word, TextEdit, LibreOffice, etc.    

## **Pt.3: Advanced Cyber Deception Techniques**
### Site Cloning Detection
- JavaScript-based canary tokens embedded in authentication pages.    
- Alerts when a **malicious clone site** is accessed.    
- Can trigger **takedown notices** automatically.    
- Obfuscation options to avoid detection.  
### Geolocation Tracking
- IP-based is weak — better options:    
    - Use router edge IPs.        
    - **Wireless signal triangulation** (Google/Apple style).        
    - Can localize attacker within **~20 meters** in ideal cases.        
### Web Bugs
- Stealthy, cross-platform, no scripting required.    
- Gathers:    
    - IP        
    - Source port        
    - Timestamps       

## **Pt.4: Honey Accounts**
### Account Deception Strategies
- Create **obvious trap accounts**:    
    - “Admin_backup”        
    - “test_admin”        
- Use accounts with **disabled login but visible presence**.    
- Restrict logins by time/location.    
- Monitor login attempts on these decoy accounts.    

## **Pt.5: Ethical Concerns**
- Rule of thumb: **"Don’t become the thing you’re trying to defeat."
- Obtain **legal clearance** before deploying deception tech.    
- Be **transparent** and **respect privacy laws**.    

## **Lab 2: HoneyShare Setup with Impacket**
### Objective
- Deploy a **fake SMB share** using Impacket to detect unauthorized access and **capture hashes** for analysis.
### Environment
- **Attacker Machine**: Kali Linux    
- **Target Machine**: Windows   
### Steps
1. Get Kali’s IP:    
    ```bash
    ifconfig
    ```
    
2. Become root:    
    ```bash
    sudo su -
    ```
    
3. Navigate to Impacket examples:    
    ```bash
    cd /opt/impacket/examples
    ```
    
4. Start SMB server:    
    ```bash
    python3 ./smbserver.py -smb2support -comment 'secret' SECRET /secret
    ```
    
5. On Windows:    
    ```cmd
    net use * \\xxx.xxx.xx.xxx\secret
    ```
### Outcome
- **Failed authentication** still triggers a log.    
- Captures attempted **username, host, and password hash**.    
- Useful for detecting **lateral movement**, **insider threats**, and **early-stage compromises**.    

## **Tool Recc.**
- **Free/Open Source**:    
    - Canarytokens.org – Generates trap files and URLs that alert you when accessed.  
    - Impacket – Collection of Python tools for crafting and manipulating network protocols.  
- **Commercial**:    
    - Elusive – Enterprise deception platform that creates fake assets to detect intrusions.  
    - TrapX – Deploys decoy systems and sensors to detect lateral movement and attacks.  
    - Symmetry – Provides deception and attack surface reduction using fake credentials and services.