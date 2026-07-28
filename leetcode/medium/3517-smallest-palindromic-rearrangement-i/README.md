# Smallest Palindromic Rearrangement I

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a  **palindromic**  string `s`.

Return the  **lexicographically smallest**  palindromic permutation of `s`.

 

 **Example 1:** 

 **Input:**  s = "z"

 **Output:**  "z"

 **Explanation:** 

A string of only one character is already the lexicographically smallest palindrome.

 **Example 2:** 

 **Input:**  s = "babab"

 **Output:**  "abbba"

 **Explanation:** 

Rearranging `"babab"` → `"abbba"` gives the smallest lexicographic palindrome.

 **Example 3:** 

 **Input:**  s = "daccad"

 **Output:**  "acddca"

 **Explanation:** 

Rearranging `"daccad"` → `"acddca"` gives the smallest lexicographic palindrome.

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.
- s is guaranteed to be palindromic.

## Solution

**Language:** Java  
**Runtime:** 32 ms (beats 53.82%)  
**Memory:** 48.1 MB (beats 57.43%)  
**Submitted:** 2026-07-28T18:29:07.749Z  

```java
class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder first=new StringBuilder();
        StringBuilder middle=new StringBuilder();
        for(int i=0;i<26;i++){
            while(freq[i]>=2){
                first.append((char)('a'+i));
                freq[i]-=2;
            }
            if(freq[i]==1){
                middle.append((char)('a'+i));
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append(first);
        sb.append(middle);
        sb.append(new StringBuilder(first).reverse());
        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-palindromic-rearrangement-i/)