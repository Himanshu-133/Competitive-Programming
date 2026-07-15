# Counting Words With a Given Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of strings `words` and a string `pref`.

Return  *the number of strings in* `words` *that contain* `pref` *as a  **prefix***.

A  **prefix**  of a string `s` is any leading contiguous substring of `s`.

 

 **Example 1:** 

```
Input: words = ["pay","attention","practice","attend"], pref = "at"
Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".

```

 **Example 2:** 

```
Input: words = ["leetcode","win","loops","success"], pref = "code"
Output: 0
Explanation: There are no strings that contain "code" as a prefix.

```

 

 **Constraints:** 

- 1 <= words.length <= 100
- 1 <= words[i].length, pref.length <= 100
- words[i] and pref consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.4 MB (beats 28.91%)  
**Submitted:** 2026-07-15T15:25:27.292Z  

```java
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String sb:words){
            if(sb.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/counting-words-with-a-given-prefix/)