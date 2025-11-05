Key takeaways

- Real-world focus, Dunning-Kruger learning curve, set goals before digging; prioritize order of volatility and clean evidence collection
- Be tool-independent, rely on pattern recognition and environment context

Workflow

- Collect: Arsenal Image Mounter to mount VMDK, KAPE “Triage” target to grab artifacts
- Parse: Eric Zimmermann tools via KAPE modules; analyze CSV outputs with Timeline Explorer
- Document: Build a consolidated timeline; track sources, times, and evidence

Core artifacts to examine

- NTFS: MFT, USN Journal for create/modify/delete
- Registry: SYSTEM, SOFTWARE, NTUSER.DAT, UserClass.dat
- Event Logs: Security, Sysmon if present
- User activity: ShellBags, ActivitiesCache.db, LNK files, RecentDocs
- Execution evidence: Prefetch, AmCache, ShimCache
- Browser and app data as relevant

Insider-theft case highlights

- ShellBags showed access to corporate shares and personal folders
- ActivitiesCache.db showed Google Drive install/use, copy-paste, Ccleaner execution, resignation docs
- Prefetch confirmed executables including 7-Zip, GoogleDriveSetup, CCleaner
- Google Drive forensics: AppData Local Google DriveFS user folder, metadata SQLite, Content Cache with magic headers; recover PDFs, ZIPs; validated staged exfil (e.g., “out.zip”)

Google Drive recovery approach

- Inspect: %LocalAppData%\Google\DriveFS<UserID>\metadata.sqlite and \content_cache\
- Recover: Parse cache files by magic headers and join with SQLite “items” table
- Reference tool: “Google Drive Forensics Extractor and Metadata Exporter” (Python)

Best practices

- Memory before disk before triage tools when legal defensibility matters
- Use isolated forensic labs; maintain chain of custody and integrity checks
- Build timelines that merge artifact sources for narrative clarity

Tools mentioned

- Arsenal Image Mounter
- KAPE + Eric Zimmermann parsers
- Timeline Explorer
- Wireshark, 7-Zip, CCleaner observed in case
- Custom Python Google Drive cache extractor

Training and references

- Practical Windows Forensics cheat sheet on GitHub
- CrowdStrike incident timeline spreadsheet template
- Books: Kevin Mandia IR book, Harlan Carvey Windows forensics

Open questions to apply internally

- Do we have a rapid evidence collection playbook for endpoints and cloud apps
- Are Google Drive and similar cache paths covered in our insider-threat SOPs
- Do we routinely merge ActivitiesCache, ShellBags, Prefetch, and NTFS into one timeline



