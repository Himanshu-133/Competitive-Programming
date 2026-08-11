# Smallest Missing Integer Greater Than Sequential Prefix Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a  **0-indexed**  array of integers `nums`.

A prefix `nums[0..i]` is  **sequential**  if, for all `1 <= j <= i`, `nums[j] = nums[j - 1] + 1`. In particular, the prefix consisting only of `nums[0]` is  **sequential**.

Return  *the  **smallest**  integer*  `x`  *missing from*  `nums`  *such that*  `x`  *is greater than or equal to the sum of the  **longest**  sequential prefix.* 

 

 **Example 1:** 

```
Input: nums = [1,2,3,2,5]
Output: 6
Explanation: The longest sequential prefix of nums is [1,2,3] with a sum of 6. 6 is not in the array, therefore 6 is the smallest missing integer greater than or equal to the sum of the longest sequential prefix.

```

 **Example 2:** 

```
Input: nums = [3,4,5,1,12,14,13]
Output: 15
Explanation: The longest sequential prefix of nums is [3,4,5] with a sum of 12. 12, 13, and 14 belong to the array while 15 does not. Therefore 15 is the smallest missing integer greater than or equal to the sum of the longest sequential prefix.

```

 

 **Constraints:** 

- 1 <= nums.length <= 50
- 1 <= nums[i] <= 50

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.8 MB (beats 88.46%)  
**Submitted:** 2026-08-11T19:59:19.073Z  

```java
class Solution {
    public int missingInteger(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            //int sum=0;
            if(nums[i]==nums[i-1]+1){
                max+=nums[i];
            }else{
                break;
            }
        }
        int ans=max;
        while(true){
            boolean found=false;
            for(int num:nums){
                if(num==ans){
                    found=true;
                    break;
                }
            }
            if(!found){
                return ans;
            }
            ans++;
        }
        //return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/)