# Defanging an IP Address

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a valid (IPv4) IP `address`, return a defanged version of that IP address.

A  *defanged IP address*  replaces every period `"."` with `"[.]"`.

 

 **Example 1:** 

```
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

```

 **Example 2:** 

```
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

```

 

 **Constraints:** 

- The given address is a valid IPv4 address.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 22.88%)  
**Memory:** 43 MB (beats 12.51%)  
**Submitted:** 2026-07-17T18:22:43.954Z  

```java
class Solution {
    public String defangIPaddr(String address) {
        Stack<Character> sb=new Stack<>();
        for(char ch:address.toCharArray()){
            if(ch!='.'){
                sb.push(ch);
            }else{
                char a=ch;
                sb.push('[');
                sb.push(a);
                sb.push(']');
            }
        }
        Collections.reverse(sb);
        StringBuilder ab=new StringBuilder();
        while (!sb.isEmpty()) {
            ab.append(sb.pop());
        }
        return ab.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/defanging-an-ip-address/)