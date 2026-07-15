# Sum of Elements With Frequency Divisible by K

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums` and an integer `k`.

Return an integer denoting the  **sum**  of all elements in `nums` whose  **frequency**  is divisible by `k`, or 0 if there are no such elements.

 **Note:**  An element is included in the sum  **exactly**  as many times as it appears in the array if its total frequency is divisible by `k`.

 

 **Example 1:** 

 **Input:**  nums = [1,2,2,3,3,3,3,4], k = 2

 **Output:**  16

 **Explanation:** 

- The number 1 appears once (odd frequency).
- The number 2 appears twice (even frequency).
- The number 3 appears four times (even frequency).
- The number 4 appears once (odd frequency).

So, the total sum is `2 + 2 + 3 + 3 + 3 + 3 = 16`.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4,5], k = 2

 **Output:**  0

 **Explanation:** 

There are no elements that appear an even number of times, so the total sum is 0.

 **Example 3:** 

 **Input:**  nums = [4,4,4,1,2,3], k = 3

 **Output:**  12

 **Explanation:** 

- The number 1 appears once.
- The number 2 appears once.
- The number 3 appears once.
- The number 4 appears three times.

So, the total sum is `4 + 4 + 4 = 12`.

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100
- 1 <= k <= 100

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 52.36%)  
**Memory:** 44.1 MB (beats 89.86%)  
**Submitted:** 2026-07-15T15:22:41.806Z  

```java
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> sb=new HashMap<>();
        for(int num: nums){
            sb.put(num,sb.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer, Integer> entry:sb.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            if(freq%k==0){
                sum=sum+num*freq;
            }
        }
        return sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-elements-with-frequency-divisible-by-k/)