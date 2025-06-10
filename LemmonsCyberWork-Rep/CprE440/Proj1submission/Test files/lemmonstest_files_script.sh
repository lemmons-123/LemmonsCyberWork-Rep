#!/bin/bash

echo "Trusted file" > trusted.txt
setfattr -n secuirty.sample -v 'trusted' trusted.txt

echo "Untrusted file" > untrusted.txt
setfattr -n secuirty.sample -v 'untrusted' untrusted.txt

echo "this is a file with no security attributes" > no_attr.txt

echo "Test files created."
