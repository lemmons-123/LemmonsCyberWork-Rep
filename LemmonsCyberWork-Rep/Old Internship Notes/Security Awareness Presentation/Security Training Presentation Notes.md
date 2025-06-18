# Executive’s Security Training Presentation Notes

[Resource Dump](https://www.notion.so/Resource-Dump-b1fd6bdf16944f8ab3c7ae9ad8735872?pvs=21)

[Notes](https://www.notion.so/Notes-0693f454c77f42638b2e93c6e62d5414?pvs=21)

[Demo Ideas ](https://www.notion.so/Demo-Ideas-0188b5093b724de4a8d93998002530f8?pvs=21)

## Slide 4: How are they made?

*Play Video*

- The creation of deepfakes involves several key steps. It begins with data collection, where a large dataset of footage with the set target is gathered. This could include videos, images, and audio recordings from various sources on the internet like the ones Brendon mentioned earlier.
- AI algorithms are then trained on this dataset to learn the person's facial features and expressions as well as voice tone and infliction in detail.
- Once this is complete, the next phase involves actually combining these learned features with other source material to create the fake video or image.
- Finally, there's an iterative refinement process where the deepfake is enhanced to improve its realism and believability. The diagram here shows how the refinement process occurs which is basically a weed out process using a discriminator that can do a good job of telling the difference between real and AI media. This multi-step approach requires little user interaction and allows even those without technical skills to create convincing deepfakes with these AI tools.

## Slide 5: Available Technology

- To reiterate, the technology for creating deepfakes is becoming increasingly accessible and many resources are now available for free.
    - One example is the Ultimate AI Face Swap Tool. It is a free online resource that offers various tools and guides for manipulating videos, photos, and GIFs. This means without even signing up for an account, you can go into google right now and start creating your own deepfakes. It even includes features for speech and voice manipulation which is becoming more popular in free deepfake software nowadays.
    - Another popular option is DeepFaceLab 2.0. This one is also free but requires users to download its software. DeepFaceLabs allows users to replace faces, de-age faces, replace heads, and manipulate lips and speech. This software is a lot more sophisticated than the online version but is also more intensive on your computer since it requires local processing power.
- Regardless of which one chosen, these tools are not only effective and thorough but also easily accessible to the general public. The abundance and availability of these software and user-friendly guides mean that creating convincing deepfakes no longer requires specialized technical knowledge or expensive software. All it really takes is some free time and passion.

## Slide 7: Put into Perspective: Old vs. New

- The evolution of deepfake technology has been rapid and significant. Let's compare examples from 2017 to more recent ones.

*Play Video#1*

- As you may have seen, the older deepfake examples were characterized by lower resolution, noticeable artifacts such as blurry edges around faces, weird eye placement, poor coloration, and less realistic movements. Also, the video shown a few slides back was from 2018 and holds similar to the video just shown. Though some of the examples themselves were silly, it shows progression and a glimpse of what's to come…

*Play Video#2*

- Now, in contrast to the past videos, the recent examples from 2023 showcase higher resolution, minimal artifacts, and more sophisticated audio. The movements in newer deepfakes appear more natural with improved face coloration and lip syncing making them increasingly difficult to distinguish from genuine footage.
- This dramatic improvement in just a few years highlights the growing challenge of detecting deepfakes and underscores the potential risks they pose in various contexts like personal and enterprise security

## Slide 12: Deepfake Video vs. MUSL

- To further demonstrate the potential of deepfake technology, we attempted to create an example using one of the readily available tools. We first wrote up a short script for our subject, Wayne, and had him read it out loud while we recorded him from various angles. Now, Using DeepFaceLab, the free downloadable software, we simply put the video into the input file and let the algorithm do its thing.
- With just these elements and some time, we were able to create a… well just take a look for yourselves

*Play Snippet*

- Yeah, so not the best… now, it was our first and only attempt but if we were to improve on the model, we would start by getting Brendon a good ol’ haircut
- The resulting video accurately replicated key features such as skin color, eyes, and hair. This experiment illustrates how accessible and powerful these tools have become.
- At the end of the day though, it's crucial to understand that with minimal resources, individuals can create deepfakes that closely resemble real people, and potentially for malicious purposes.

## Slide 13: Potential Impacts to MUSL

- Now, with this technology being so readily available, bad actors are inevitably going to get their hands on it. And in the wrong hands, deepfake tech poses several negative effects and impacts to organizations like MUSL.
- First, there's the risk of identity theft and fraud. Bad actors could impersonate MUSL staff to gain sensitive information or unauthorized access to systems.
    - The attack on the British company is a great example of this. With sophisticated real-time deepfake technology they were able to impersonate the CFO and, in this case, gained millions of dollars
- Another potential impact is the spreading of misinformation or manipulation of situations. This could occur if a bad actor’s whole plan is disrupting operations or decision-making processes.
    - Say a bitter and disgruntled former employee takes advantage of similar technology as the attackers from the UK attack… With good understanding of draw procedures and the sole purpose of disrupting them, someone could potentially disguise themselves as one of the lotteries’ representatives and during a live drawing session, try and contact Sue and tell her that, say, their numbers were falsified but still happened to be submitted to FLEX. Though something like that would probably be caught, it would require extra unnecessary labor from our team which, for some vindictive people is a win.
- That said, deepfake attacks CAN exploit the trust placed in known individuals or the organization itself. This deception can lead to severe reputational damage, undermining credibility and relationships with the general public and stakeholders, or in our case, the member lotteries.
- Recognizing these threats is the first step in developing strategies to mitigate them.

## Slide 17: Personal Protection

- So, protecting yourself from deepfake threats involves a few key strategies.
- First and foremost is awareness and education – understanding the nature of deepfakes and staying informed about current trends.
    - There are many awareness training guides and courses on platforms like KnowBe4 specifically catered to AI and deepfake protection. Using these resources to stay informed will help individuals better spot and negate these attacks and in turn will strength a company’s security posture.
- Now that we are all experts in spotting deepfakes, a crucial form of protection is just to always verify and authenticate, especially when it comes from unexpected or unusual sources.
    - Hackers are sneaky so we must always keep our eyes open for the smallest of discrepancies
- And of course, Always report and document suspicious content or requests.
    - Just like with sketchy phishing emails, you should always report things like suspicious calls or weird teams meeting invites.
- I want to further iterate that victims in these corporate deepfake attacks tend to be targeted towards a single low-ranking individual of a company. Now we have a lot of leeway since we are such a small company, but personal vigilance is still key.
    - It's important to exercise critical thinking by question the authenticity of unusual or unexpected requests, especially ones involving sensitive information or actions.
    - Finally, and what I find most important, is practicing cross-verification. By independently confirming requests through trusted contacts or established channels we negate just about all forms of deepfake attacks.
- These habits combined can significantly reduce the risk of falling victim to deepfake-based deception.

## Slide 18: Conclusion

- And with that, thank you for listening to our presentation. Do we have any questions?