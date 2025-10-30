### **Overview**  
BHIS SOC is highly interactive with customers. They share detections, queries, and collaborate live during incidents, unlike vendors who just hand off tickets.  

**What is SOAR**  
Security Orchestration, Automation, and Response helps blue teams automate and coordinate the full alert lifecycle, from grouping and enrichment to response actions.  

**Why SOAR Matters**  
SOAR reduces alert fatigue, speeds response, and improves investigations. It doesn’t remove work but helps teams focus on the right priorities.  

**Alert Reality**  
A study found about 17,000 alerts per week with only 19% reliable. In practice, true positive rates are often closer to 5–10% unless tuning is too aggressive.  

**Impact Metrics**  
Elastic with Tines saved around 750 hours a year, equal to about three full-time employees. BHIS saw about 60% fewer alerts and over 90% fewer cases after grouping and risk scoring.  

**Automation Value**  
Saving even a few minutes per alert adds up quickly. Those gains compound when reinvested into improving automations.  

**Barriers to Entry**  
Costs can reach around \$500,000 per year. SOAR requires specialized skills, months of setup, and constant maintenance. Success depends on living, evolving playbooks.  

**Implementation Path**  
Start with onboarding and training. Prototype small use cases, learn platform quirks, then build and refine playbooks over time.  

**Required Skills**  
Strong Python, some PowerShell or Bash, solid SOC context, deep API knowledge, and comfort parsing JSON and structured data.  

**Quality Control**  
Do not auto-close low-severity alerts. Keep human review where it matters and design for scale and change.  

**Playbooks**  
The core of SOAR. Triggered workflows that take inputs, enrich data, and act.  

**Sub-Playbooks**  
Reusable building blocks. Use them to avoid rework when APIs or logic change.  

**Example: Suspicious Login**  
Input a user principal, call Microsoft Graph API to disable the account and revoke sessions. Tested on “Evil Ethan,” confirmed disabled and logged out.  

**Example: Phishing Triage**  
Pull email data, normalize IDs, check message scores, deduplicate, and create a SOAR case plus Jira ticket for unified tracking.  

**One-Click Actions**  
Analysts can trigger playbooks directly to quarantine, release, close tickets, and more without switching tools.  

**Design Guidance**  
Plan before building. Target time sinks. Use enrichment over static checks. Gather feedback. Ship MVPs and iterate.  

**Emerging AI in SOAR**  
Use AI to summarize cases or assist with context queries but keep human oversight. Apply it where errors are low-risk and obvious.  

**Takeaway**  
SOAR improves investigation speed and quality through automation, enrichment, and smart grouping when built with discipline and reusable playbooks.