# Consecutive Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

The  **power**  of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string `s`, return  *the  **power**  of*  `s`.

 

 **Example 1:** 

```
Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.

```

 **Example 2:** 

```
Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

```

 

 **Constraints:** 

- 1 <= s.length <= 500
- s consists of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-08-05T18:54:35.469Z  

```java
class Solution {
    public int maxPower(String s) {
        if(s==null || s.length()==0)return 0;
        if(s.length()==1)return 1;
        int count=1;
        int c=Integer.MIN_VALUE;
        char[] res=s.toCharArray();
        for(int i=1;i<res.length;i++){
            if(res[i-1]==res[i]){
                count++;
            }else{
                count=1;
            }
            c=Math.max(c,count);
        }
        return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/consecutive-characters/)