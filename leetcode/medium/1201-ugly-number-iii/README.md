# Ugly Number III

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

An  **ugly number**  is a positive integer that is divisible by `a`, `b`, or `c`.

Given four integers `n`, `a`, `b`, and `c`, return the `nth`  **ugly number**.

 

 **Example 1:** 

```
Input: n = 3, a = 2, b = 3, c = 5
Output: 4
Explanation: The ugly numbers are 2, 3, 4, 5, 6, 8, 9, 10... The 3rd is 4.

```

 **Example 2:** 

```
Input: n = 4, a = 2, b = 3, c = 4
Output: 6
Explanation: The ugly numbers are 2, 3, 4, 6, 8, 9, 10, 12... The 4th is 6.

```

 **Example 3:** 

```
Input: n = 5, a = 2, b = 11, c = 13
Output: 10
Explanation: The ugly numbers are 2, 4, 6, 8, 10, 11, 12, 13... The 5th is 10.

```

 

 **Constraints:** 

- 1 <= n, a, b, c <= 109
- 1 <= a  *b*  c <= 1018
- It is guaranteed that the result will be in range [1, 2 * 109].

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.8 MB (beats 93.48%)  
**Submitted:** 2026-08-03T20:01:31.012Z  

```java
class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long left=1;
        long right=2_000_000_000L;
        while(left<right){
            long mid=left+(right-left)/2;
            long count=mid/a+mid/b+mid/c-mid/lcm(a,b)-mid/lcm(b,c)-mid/lcm(a,c)+mid/lcm(lcm(a,b),c);
            if(count>=n){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return (int)left;
    }
    private long gcd(long a,long b){
        while(b!=0){
            long temp=a%b;
            a=b;
            b=temp;
        }
        return (int)a;
    }
    private long lcm(long a, long b){
        return (int)a/gcd(a,b)*b;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/ugly-number-iii/)