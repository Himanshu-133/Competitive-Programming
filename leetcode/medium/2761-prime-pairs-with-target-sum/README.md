# Prime Pairs With Target Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer `n`. We say that two integers `x` and `y` form a prime number pair if:

- 1 <= x <= y <= n
- x + y == n
- x and y are prime numbers

Return  *the 2D sorted list of prime number pairs*  `[xi, yi]`. The list should be sorted in  **increasing**  order of `xi`. If there are no prime number pairs at all, return  *an empty array*.

 **Note:**  A prime number is a natural number greater than `1` with only two factors, itself and `1`.

 

 **Example 1:** 

```
Input: n = 10
Output: [[3,7],[5,5]]
Explanation: In this example, there are two prime pairs that satisfy the criteria. 
These pairs are [3,7] and [5,5], and we return them in the sorted order as described in the problem statement.

```

 **Example 2:** 

```
Input: n = 2
Output: []
Explanation: We can show that there is no prime number pair that gives a sum of 2, so we return an empty array. 

```

 

 **Constraints:** 

- 1 <= n <= 106

## Solution

**Language:** Java  
**Runtime:** 1991 ms (beats 5.58%)  
**Memory:** 55 MB (beats 53.19%)  
**Submitted:** 2026-08-04T19:51:38.269Z  

```java
class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> sb= new ArrayList<>();
        if(n<=3){
            return sb;
        }
        for(int i=2;i<=n/2;i++){
            int j=n-i;
            if(isprime(i) && isprime(j)){
                List<Integer> ab=new ArrayList<>();
                ab.add(i);
                ab.add(j);
                sb.add(ab);
            }
        }
        return sb;
    }
    private static boolean isprime(int a){
        if(a<2)return false;
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/prime-pairs-with-target-sum/)