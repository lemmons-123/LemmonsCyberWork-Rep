# How to SOAR in a SOC – Hayden Covington

Summary of the Anti-Siphon webinar on Security Orchestration, Automation, and Response (SOAR) with Hayden Covington, focusing on real-world SOC automation, alert management, and workflow design.

## Overview
BHIS SOC works interactively with customers, sharing detections and collaborating live during incidents—unlike vendors that only issue tickets.

## What is SOAR
A framework that automates and coordinates the alert lifecycle, grouping, enriching, and responding to security events.

## Why It Matters
SOAR reduces alert fatigue, speeds response, and improves investigations. It doesn’t remove work—it helps teams focus on what matters most.

## Key Insights
- Typical SOCs face ~17,000 alerts per week, with only 5–10% true positives.  
- Elastic with Tines saved ~750 hours annually (~3 FTEs).  
- BHIS saw 60% fewer alerts and 90% fewer cases after grouping and risk scoring.  
- Even small time savings per alert compound when reinvested into automation.

## Challenges
High cost (up to \$500K per year), steep learning curve, and continuous maintenance. Success depends on evolving playbooks and skilled staff.

## Implementation Path
Start small with onboarding and prototype use cases. Build playbooks iteratively and refine based on analyst feedback.

## Required Skills
Strong Python, PowerShell or Bash familiarity, SOC experience, API integration, and JSON data handling.

## Best Practices
- Don’t auto-close low-severity alerts.  
- Use reusable sub-playbooks for repeatable steps.  
- Plan before building and ship MVPs quickly.  
- Keep human review where needed.

## Example Use Cases
- **Suspicious Login:** Disable account and revoke sessions via Microsoft Graph API.  
- **Phishing Triage:** Normalize email data, deduplicate, and auto-create SOAR and Jira cases.

## Emerging AI in SOAR
Use AI for summarizing cases and querying context, but keep human oversight for accuracy.

---
```
