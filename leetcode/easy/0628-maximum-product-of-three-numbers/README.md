# Maximum Product of Three Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`,  *find three numbers whose product is maximum and return the maximum product*.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: 6

```

 **Example 2:** 

```
Input: nums = [1,2,3,4]
Output: 24

```

 **Example 3:** 

```
Input: nums = [-1,-2,-3]
Output: -6

```

 

 **Constraints:** 

- 3 <= nums.length <= 104
- -1000 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 16 ms (beats 37.76%)  
**Memory:** 48.4 MB (beats 11.58%)  
**Submitted:** 2026-07-26T17:56:18.882Z  

```java
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums); 
        int n = nums.length;
        int option1 = nums[n-1] * nums[n-2] * nums[n-3];
        int option2 = nums[0] * nums[1] * nums[n-1];
        return Math.max(option1,option2);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/)