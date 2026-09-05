# Check Divisibility by Digit Sum and Product

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a positive integer `n`. Determine whether `n` is divisible by the  **sum** of the following two values:

- The digit sum of n (the sum of its digits).
- The digit product of n (the product of its digits).

Return `true` if `n` is divisible by this sum; otherwise, return `false`.

 

 **Example 1:** 

 **Input:**  n = 99

 **Output:**  true

 **Explanation:** 

Since 99 is divisible by the sum (9 + 9 = 18) plus product (9 * 9 = 81) of its digits (total 99), the output is true.

 **Example 2:** 

 **Input:**  n = 23

 **Output:**  false

 **Explanation:** 

Since 23 is not divisible by the sum (2 + 3 = 5) plus product (2 * 3 = 6) of its digits (total 11), the output is false.

 

 **Constraints:** 

- 1 <= n <= 106

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.2 MB (beats 74.01%)  
**Submitted:** 2026-09-05T19:58:05.573Z  

```java
class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int sum=0,prod=1;
        while(org>0){
            int digit=org%10;
            sum=sum+digit;
            prod=prod*digit;
            org=org/10;
        }
        if(n%(sum+prod)==0){
            return true;
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/)