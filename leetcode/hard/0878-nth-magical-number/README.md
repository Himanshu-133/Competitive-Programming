# Nth Magical Number

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

A positive integer is  *magical*  if it is divisible by either `a` or `b`.

Given the three integers `n`, `a`, and `b`, return the `nth` magical number. Since the answer may be very large,  **return it modulo** `109 + 7`.

 

 **Example 1:** 

```
Input: n = 1, a = 2, b = 3
Output: 2

```

 **Example 2:** 

```
Input: n = 4, a = 2, b = 3
Output: 6

```

 

 **Constraints:** 

- 1 <= n <= 109
- 2 <= a, b <= 4 * 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.3 MB (beats 19.16%)  
**Submitted:** 2026-08-03T19:28:17.851Z  

```java
class Solution {
    private static final int mod=1_000_000_007;
    public int nthMagicalNumber(int n, int a, int b) {
        long lcm=(long)a*b/gcd(a,b);
        long left=Math.min(a,b);
        long right=(long)n*Math.min(a,b);
        while(left<right){
            long mid=left+(right-left)/2;
            long count=mid/a+mid/b-mid/lcm;
            if(count>=n){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return (int)(left%mod);
    }
    private long gcd(long a, long b){
        while(b!=0){
            long temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/nth-magical-number/)