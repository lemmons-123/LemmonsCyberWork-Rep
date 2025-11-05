# MetaCTF – Practice Challenge: Treasure Map

This folder documents participation in the **MetaCTF Practice Challenge** titled *Treasure Map*. The exercise simulated a beginner-level web exploitation scenario focused on reconnaissance and hidden resource discovery.

---

## Overview

**Objective:** Locate a hidden “treasure” flag by enumerating web directories and analyzing exposed configuration files.  
**Platform:** MetaCTF  
**Category:** Web Exploitation  

---

## Process Summary

- Began with standard enumeration using `/robots.txt` to identify restricted paths.  
- Discovered a reference to `/sitemap.xml` containing indexed URLs.  
- Parsed the sitemap to locate hidden directories (`/crew/`, `/io/`) and potential flag locations.  
- Used browser inspection and manual navigation to uncover the final flag endpoint.  

---

## Tools Used

- **Kali Linux** for reconnaissance  
- **Burp Suite** and **browser inspection** for request analysis  
- **XML parsing** for sitemap review  

---

## Skills Demonstrated

- Web enumeration and directory discovery  
- Reconnaissance through metadata and sitemap analysis  
- Manual exploitation and logical reasoning in CTF environments  

---

> This challenge reinforced practical web reconnaissance skills and served as a foundation for ongoing participation in MetaCTF’s monthly competitions.