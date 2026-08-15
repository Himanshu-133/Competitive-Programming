# Longest Subsequence With Non-Zero Bitwise XOR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums`.

Return the length of the  **longest subsequence**  in `nums` whose bitwise  **XOR**  is  **non-zero**. If no such  **subsequence**  exists, return 0.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3]

 **Output:**  2

 **Explanation:** 

One longest subsequence is `[2, 3]`. The bitwise XOR is computed as `2 XOR 3 = 1`, which is non-zero.

 **Example 2:** 

 **Input:**  nums = [2,3,4]

 **Output:**  3

 **Explanation:** 

The longest subsequence is `[2, 3, 4]`. The bitwise XOR is computed as `2 XOR 3 XOR 4 = 5`, which is non-zero.

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 0 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 133.3 MB (beats 88.24%)  
**Submitted:** 2026-08-15T22:02:36.911Z  

```java
class Solution {
    public int longestSubsequence(int[] nums) {
        int a=0;
        int b=0;
        for(int x:nums){
            a^=x;
            if(x==0){
                b++;
            }
        }
        if(a!=0){
            return nums.length;
        }
        if(b==nums.length){
            return 0;
        }
        return nums.length-1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/)