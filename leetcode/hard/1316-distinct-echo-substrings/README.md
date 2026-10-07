# Distinct Echo Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Return the number of  **distinct**  non-empty substrings of `text` that can be written as the concatenation of some string with itself (i.e. it can be written as `a + a` where `a` is some string).

 

 **Example 1:** 

```
Input: text = "abcabcabc"
Output: 3
Explanation: The 3 substrings are "abcabc", "bcabca" and "cabcab".

```

 **Example 2:** 

```
Input: text = "leetcodeleetcode"
Output: 2
Explanation: The 2 substrings are "ee" and "leetcodeleetcode".

```

 

 **Constraints:** 

- 1 <= text.length <= 2000
- text has only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 2087 ms (beats 16.95%)  
**Memory:** 50.6 MB (beats 16.52%)  
**Submitted:** 2026-10-07T19:54:00.738Z  

```java
class Solution {
    public int distinctEchoSubstrings(String text) {
        Set<String> sb=new HashSet<>();
        int n=text.length();
        for(int i=0;i<n;i++){
            for(int j=1;i+2*j<=n;j++){
                String first=text.substring(i,i+j);
                String second=text.substring(i+j,i+2*j);
                if(first.equals(second)){
                    sb.add(first+second);
                }
            }
        }
        return sb.size();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/distinct-echo-substrings/)