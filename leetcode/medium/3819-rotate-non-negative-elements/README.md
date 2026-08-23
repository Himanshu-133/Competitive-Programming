# Rotate Non Negative Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` and an integer `k`.

Rotate only the  **non-negative**  elements of the array to the  **left**  by `k` positions, in a cyclic manner.

All  **negative**  elements must stay in their original positions and must not move.

After rotation, place the  **non-negative**  elements back into the array in the new order, filling only the positions that originally contained  **non-negative**  values and  **skipping all negative**  positions.

Return the resulting array.

 

 **Example 1:** 

 **Input:**  nums = [1,-2,3,-4], k = 3

 **Output:**  [3,-2,1,-4]

 **Explanation:** ​​​​​​​

- The non-negative elements, in order, are [1, 3].
- Left rotation with k = 3 results in: [1, 3] -> [3, 1] -> [1, 3] -> [3, 1]
- Placing them back into the non-negative indices results in [3, -2, 1, -4].

 **Example 2:** 

 **Input:**  nums = [-3,-2,7], k = 1

 **Output:**  [-3,-2,7]

 **Explanation:** 

- The non-negative elements, in order, are [7].
- Left rotation with k = 1 results in [7].
- Placing them back into the non-negative indices results in [-3, -2, 7].

 **Example 3:** 

 **Input:**  nums = [5,4,-9,6], k = 2

 **Output:**  [6,5,-9,4]

 **Explanation:** 

- The non-negative elements, in order, are [5, 4, 6].
- Left rotation with k = 2 results in [6, 5, 4].
- Placing them back into the non-negative indices results in [6, 5, -9, 4].

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -105 <= nums[i] <= 105
- 0 <= k <= 105

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 91.01%)  
**Memory:** 275.8 MB (beats 9.36%)  
**Submitted:** 2026-08-23T21:43:30.077Z  

```java
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int num:nums){
            if(num>=0){
                count++;
            }
        }
        if(count<=1){
            return nums;
        }
        k%=count;
        int idx=0;
        int[] pos=new int[count];
        for(int num:nums){
            if(num>=0){
                pos[idx++]=num;
            }
        }
        idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                nums[i]=pos[(idx+k)%count];
                idx++;
            }
        }
        return nums;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/rotate-non-negative-elements/)