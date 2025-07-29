### Box: `start` (TryHackMe T28_Start)
![[c7809c86-e37a-44f0-82a5-37e8472f6643.png]]
#### Goal:

Trigger a buffer overflow to call the `print_flag` function and grab the flag.

---
![[e1d41745-c36b-4a60-8361-3db142f12acb.png]]
###  Recon:

- `strings ./start` shows `print_flag`, `flag.txt`, and some output messages.    
- Binary uses `gets()` to take user input — classic overflow target.    
- `objdump -d ./start | grep print_flag` shows:  
    `0x401216 <print_flag>`
    
###  Vulnerability:

- Uses `gets()` on a 0x30 (48 byte) buffer.    
- No stack canary, PIE disabled.    
- Overflow lets us control RIP.    

### Exploitation:

Fuzz input:

```bash
perl -e 'print "A"x64' | ./start
```

After enough A’s (about **72 bytes**), execution hits `print_flag()`.

Just manually put in a long string of characters

![[Pasted image 20250628154737.png]]