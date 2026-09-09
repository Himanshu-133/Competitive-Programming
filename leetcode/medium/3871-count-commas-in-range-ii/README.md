# Count Commas in Range II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer `n`.

Return the  **total**  number of commas used when writing all integers from `[1, n]` (inclusive) in  **standard**  number formatting.

In  **standard**  formatting:

- A comma is inserted after every three digits from the right.
- Numbers with fewer than 4 digits contain no commas.

 

 **Example 1:** 

 **Input:**  n = 1002

 **Output:**  3

 **Explanation:** 

The numbers `"1,000"`, `"1,001"`, and `"1,002"` each contain one comma, giving a total of 3.

 **Example 2:** 

 **Input:**  n = 998

 **Output:**  0

 **Explanation:** 

 **​​​​​​​** All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.

 

 **Constraints:** 

- 1 <= n <= 1015

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.36%)  
**Memory:** 42.8 MB (beats 24.36%)  
**Submitted:** 2026-09-09T17:57:19.100Z  

```java
class Solution {
    public long countCommas(long n) {
        long ans=0;
        long start=1000;
        long commas=1;
        while(start<=n){
            long end=Math.min(n,start*1000-1);
            ans+=(end-start+1)*commas;
            start*=1000;
            commas++;
        }
        return ans;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/count-commas-in-range-ii/)