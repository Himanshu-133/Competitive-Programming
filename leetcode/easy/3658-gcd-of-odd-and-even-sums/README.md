# GCD of Odd and Even Sums

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer `n`. Your task is to compute the  **GCD**  (greatest common divisor) of two values:

- sumOdd: the sum of the smallest n positive odd numbers.
- sumEven: the sum of the smallest n positive even numbers.

Return the GCD of `sumOdd` and `sumEven`.

 

 **Example 1:** 

 **Input:**  n = 4

 **Output:**  4

 **Explanation:** 

- Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
- Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20

Hence, `GCD(sumOdd, sumEven) = GCD(16, 20) = 4`.

 **Example 2:** 

 **Input:**  n = 5

 **Output:**  5

 **Explanation:** 

- Sum of the first 5 odd numbers sumOdd = 1 + 3 + 5 + 7 + 9 = 25
- Sum of the first 5 even numbers sumEven = 2 + 4 + 6 + 8 + 10 = 30

Hence, `GCD(sumOdd, sumEven) = GCD(25, 30) = 5`.

 

 **Constraints:** 

- 1 <= n <= 10​​​​​​​00

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 83.11%)  
**Memory:** 42.8 MB (beats 20.94%)  
**Submitted:** 2026-07-15T15:09:26.678Z  

```java
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum=0,osum=0;
        for(int i=1;i<=2*n;i=i+2){
            osum=osum+i;
        }
        for(int i=2;i<=2*n;i=i+2){
            esum=esum+i;
        }
        return gcd(esum,osum,n);
    }
    private int gcd(int e,int o,int n){
        for(int i=n;i>0;i--){
            if(e%i==0 && o%i==0){
                return i;
            }
        }
        return 1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/gcd-of-odd-and-even-sums/)