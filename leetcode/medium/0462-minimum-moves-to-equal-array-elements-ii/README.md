# Minimum Moves to Equal Array Elements II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of size `n`, return  *the minimum number of moves required to make all array elements equal*.

In one move, you can increment or decrement an element of the array by `1`.

Test cases are designed so that the answer will fit in a  **32-bit**  integer.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: 2
Explanation:
Only two moves are needed (remember each move increments or decrements one element):
[1,2,3]  =>  [2,2,3]  =>  [2,2,2]

```

 **Example 2:** 

```
Input: nums = [1,10,2,9]
Output: 16

```

 

 **Constraints:** 

- n == nums.length
- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 97.70%)  
**Memory:** 47.5 MB (beats 18.24%)  
**Submitted:** 2026-09-03T21:27:33.522Z  

```java
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums); 
        int median=nums[nums.length/2]; 
        int moves=0; 
        for(int x:nums){ 
            moves+=Math.abs(x-median);
            } 
        return moves;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/)