# Hosting a Static Cybersecurity Portfolio with AWS S3, CloudFront & Route 53

## Project Overview

This project demonstrates the end-to-end deployment of my personal cybersecurity portfolio using **AWS**. The goal was to create a globally accessible, secure, and performant static website to showcase my skills, resume, and projects without relying on traditional web hosting platforms.

The site is built with **HTML** and **TailwindCSS**, and hosted via **Amazon S3** with **CloudFront** as the CDN, **Route 53** for DNS management, and **AWS Certificate Manager (ACM)** for HTTPS.

---

## Tech Stack

| AWS Service      | Purpose                                |
|------------------|----------------------------------------|
| Amazon S3        | Static site hosting (origin)           |
| CloudFront       | CDN with HTTPS + Custom Domain         |
| ACM              | TLS certificate for HTTPS              |
| Route 53         | DNS routing for `caleblemmons.com`     |

---

## Deployment Steps

1. **Created a Public S3 Bucket**
   - Bucket name: `caleblemmons-portfolio`
   - Uploaded all static assets (HTML, CSS, resume, visuals)

2. **Configured CloudFront**
   - Origin: S3 REST endpoint (not the static website endpoint)
   - Custom Domain: `caleblemmons.com`
   - TLS: Linked to ACM-issued certificate
   - Default Root Object: `index.html`
   - Access: Attached bucket policy granting CloudFront read access using the distribution ARN

3. **Disabled S3 Static Website Hosting**
   - Prevented conflict with CloudFront by disabling static website mode in S3

4. **Set Up Route 53**
   - Created a hosted zone for `caleblemmons.com`
   - Created an **A Record (Alias)** pointing to the CloudFront distribution

5. **Tested and Verified**
   - Confirmed HTTPS access via CloudFront
   - Ensured global reachability and CDN caching

---

## Lessons Learned

- **S3 + Static Hosting ≠ CloudFront**  
  When using CloudFront, the S3 “static website hosting” option must be disabled to avoid conflicts.

- **Bucket Naming Rules Matter**  
  For S3-only setups, the bucket name must match your custom domain exactly.

- **“Access Denied” Isn’t Always Fatal**  
  Most often it's a permissions misconfiguration—bucket policy or CloudFront origin identity issues.

---

## Future Improvements

- Integrate **analytics** (e.g., Plausible, Lambda + CloudWatch)

- Add a **contact form** using a serverless backend (AWS Lambda or third-party)

---

## Live Demo

Visit the live site at: [https://caleblemmons.com](https://caleblemmons.com)

---
