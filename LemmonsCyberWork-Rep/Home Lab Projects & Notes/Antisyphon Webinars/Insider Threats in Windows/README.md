```markdown
# Investigating Insider Threats with Windows Forensics – Markus Schober

Summary of the Anti-Siphon webinar on insider-threat investigations using Windows artifacts, focusing on triage, artifact correlation, and real-world workflows.

## Key Points
- Prioritize order of volatility and clean evidence handling.  
- Be tool-agnostic and rely on pattern recognition.  
- Core artifacts: MFT, USN Journal, Registry hives, Event Logs, ShellBags, ActivitiesCache.db, Prefetch, AmCache.  

## Workflow
- **Collect:** Mount VMDKs with Arsenal Image Mounter, use KAPE “Triage” targets.  
- **Parse:** Run Eric Zimmermann tools, review CSVs in Timeline Explorer.  
- **Document:** Build unified timelines linking artifacts and timestamps.  

## Case Example
- ShellBags and ActivitiesCache.db revealed access to corporate shares and Google Drive use.  
- Prefetch confirmed 7-Zip, CCleaner, and GoogleDriveSetup execution.  
- Google Drive cache and metadata.sqlite validated staged data exfiltration (“out.zip”).  

## Best Practices
- Capture memory before disk for defensibility.  
- Use isolated labs and maintain chain of custody.  
- Merge multiple artifact sources for narrative clarity.  

## Tools
Arsenal Image Mounter • KAPE • Eric Zimmermann parsers • Timeline Explorer • Custom Python Google Drive extractor  

---
```