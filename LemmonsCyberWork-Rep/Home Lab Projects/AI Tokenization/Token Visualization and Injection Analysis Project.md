### What Was Learned:
-  How LLMs parse input at the token level (below character level)
-  Why some prompt injections succeed while others fail
-  How to estimate token costs for rate limiting
-  Token-based context window constraints and their security implications
-  Detection methods for potential injection attempts
### Technical Requirements Met:
-  No GPU required
-  Runs on minimal hardware through a Kali VM
-  No API keys or external calls
-  Pure Python implementation
-  Practical security applications

---
## 1. Setup
**Objective:** Create an isolated Python environment and install the required tokenization library.

1. Created a fresh Kali environment for the project
2. Installed `tiktoken` - OpenAI's tokenizer library that works offline
### Command:

```bash
pip install tiktoken matplotlib pandas
```
---
## 2. Step 2: Basic Tokenizer
**Objective:** Create the first script to understand basic tokenization.
### Code Created:

- Created the basic tokenizer code:
![[tokenizer_script1.png]]

**Output:**
![[tokenizer_script1_Output.png]]

---
## 3. Step 3: Security Test Cases
**Objective:** Add test cases to analyze how different attack patterns tokenize.
### Code Added:

- Added the test cases dictionary and analysis loop:
![[tokenizer_script2_Sec_test_Cases.png]]

**Output**
![[tokenizer_script2_Sec_test_Cases_Output.png]]
**What the Output Shows:**
- How different obfuscation techniques affect token count
- Character-to-token ratios for each approach
- First 10 tokens for pattern inspection
---
## 4. Step 4: Visualize Token Boundaries
**Objective:** Create visual representation of how text gets tokenized.

### Code Created:

- Added the visualization function and matplotlib imports:
![[visualize_script1.png]]

**Output**
![[visualize_script1_output.png]]
**What the Visualization Shows:**
- Each token as a colored box
- Token ID numbers inside each box
- Exact text boundaries between tokens
---
## 5. Step 5: Security-Focused Analysis
**Objective:** Add pattern detection to identify prompt injection attempts.

### Code Added:
Added the analyze_injection_attempt function below the visualization code:

![[visualize_script1_security_anal.png]]

![[visualize_script1_security_anal_output.png]]
**What the Output Shows:**

- Which injection keywords are present
- Whether they're intact tokens or split across boundaries
- Pattern detection results for the test string

---
## 6. Testing 'Realer' Prompts

**Objective:** Test realistic system prompt exfiltration scenario.

### Code Added:

Added an extra test block at the bottom of the file (unintended, at module level):
![[visualize_script1_security_anal_sys_prompt_test.png]]

![[visualize_script1_security_anal_sys_prompt_test_output.png]]
- Total tokens count
- System prompt token count (e.g., 26 tokens)
- User input token count
- Extraction estimate (~200 characters)

**What the Output Shows:**

- Exact token breakdown of system vs user prompts
- Concrete calculation of data exfiltration risk
- How much sensitive information could leak with specific token limits

---
## 9. Interpretation of Results

### Key Findings:

**Token Boundary Analysis:**

- **Intact tokens** = injection keywords appear as complete tokens → **HIGHER RISK**
    - Example: "instruction: intact" means the word wasn't broken up
    - LLM processes it as a single semantic unit
    - More likely to trigger unintended behavior

- **Split tokens** = keywords broken across multiple tokens → **LOWER RISK**
    
    - Obfuscation or Unicode tricks often cause splits
    - LLM may not recognize the pattern as easily
    - Natural defense mechanism

**System Prompt Security:**

- System prompt consumed **26 tokens**
- User input consumed **~6 tokens**
- With `max_tokens=50` limit, attacker could extract:
    - Approximately **200 characters** of system prompt
    - Enough to reveal API keys, creator names, or instructions
### Security Implications:

1. **Token limits are defensive boundaries** - Setting appropriate max_tokens prevents excessive output
2. **Character-based rate limiting is insufficient** - Must use token-based limits
3. **Unicode obfuscation has costs** - Often increases token count, making attacks more detectable
4. **Context window awareness is critical** - Knowing token budgets helps prevent injection attacks
