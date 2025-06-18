# Social Engineering Attack Demo Ideas

# Task

Start researching HOW you would start to phish someone like the executives to deepfake them (don’t actually do it yet). How would you research stuff? What tools would you use? What would your emails look like? Or phone conversations be about? How persistent would you be? How demanding? Be prepared to give me some real-life examples.

# Ideas

### Research Phase

1. **Background Info**:
    - **Professional Networks:** LinkedIn; Indeed
    - **Company Website**: Review the company website for their biography, recent projects, and press releases.
    - **Social media**: Twitter, Facebook, Instagram profiles for interests, hobbies, family/friends.
        - insight into personal life can be exploited
    - **Public Records & News articles**: any additional information or recent media mentions (previous job roles, educational background, etc.)
2. **Identify Key Associates**:
    - **Assistants**: Someone managing higher up’s schedule and communications.
    - **Colleagues**: Other high-level executives and key staff members.

### Tools/Techniques

1. **Recon Tools**:
    - **Open-Source Intelligence (OSINT): (**Shodan, Recon-ng, Spiderfoot) for detailed information.
    - **Maltego**: mapping out connections and relationships.
    - **Social-Engineer Toolkit (SET)**: harvesting social media data.
2. **Deepfake Tools**:
    - **DeepFaceLab**: high-quality deepfakes.
    - **FaceSwap**: open source
    - **Reface AI**: simpler and faster creation of face swaps and deepfake videos.

### Crafting the Phishing Campaign

1. **Phishing**:
    - **Pretext E.g.**
        - An urgent email from a trusted business partner/vendor or legal entity requesting action on a sensitive matter.
    - **Content E.g.**
        - Example: "Dear Bret, we need your immediate attention on a confidential financial matter involving Nevada’s Out of Balance issue. Please review the attached document and provide your feedback at the earliest."
    - **Attachments/Links**
        - a document titled "Q2 Financial Projections" with a malicious macro.
2. **Vishing**:
    - **Pretext e.g.**
        - Call as Bett’s assistant informing them of an emergency meeting.
    - **Script**: should not be overly demanding.
        - Example: "Hi Brett, this is Caleb from [Trusted Partner’s Company]. There’s an urgent matter that requires your immediate attention. Can you please verify your email so we can send you the necessary documents?"

### Real-Life Examples

1. **Business Email Compromise (BEC)**:
    - There have been numerous instances where high-ranking officials were tricked into transferring large sums of money to fraudsters posing as trusted partners or employees.
2. **Deepfake Audio Attacks**:
    - In 2019, cybercriminals used AI to mimic the voice of a CEO and instructed an employee to transfer $243,000 to a fraudulent account.