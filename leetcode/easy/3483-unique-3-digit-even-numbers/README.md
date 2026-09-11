# Unique 3-Digit Even Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of digits called `digits`. Your task is to determine the number of  **distinct**  three-digit even numbers that can be formed using these digits.

 **Note** : Each  *copy*  of a digit can only be used  **once per number**, and there may  **not**  be leading zeros.

 

 **Example 1:** 

 **Input:**  digits = [1,2,3,4]

 **Output:**  12

 **Explanation:**  The 12 distinct 3-digit even numbers that can be formed are 124, 132, 134, 142, 214, 234, 312, 314, 324, 342, 412, and 432. Note that 222 cannot be formed because there is only 1 copy of the digit 2.

 **Example 2:** 

 **Input:**  digits = [0,2,2]

 **Output:**  2

 **Explanation:**  The only 3-digit even numbers that can be formed are 202 and 220. Note that the digit 2 can be used twice because it appears twice in the array.

 **Example 3:** 

 **Input:**  digits = [6,6,6]

 **Output:**  1

 **Explanation:**  Only 666 can be formed.

 **Example 4:** 

 **Input:**  digits = [1,3,5]

 **Output:**  0

 **Explanation:**  No even 3-digit numbers can be formed.

 

 **Constraints:** 

- 3 <= digits.length <= 10
- 0 <= digits[i] <= 9

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 86.93%)  
**Memory:** 46.6 MB (beats 26.13%)  
**Submitted:** 2026-09-11T10:25:46.324Z  

```java
class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> sb=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            if(digits[i]%2!=0){
                continue;
            }
            for(int j=0;j<n;j++){
                if(j==i){
                    continue;
                }
                for(int k=0;k<n;k++){
                    if(k==i || k==j || digits[k]==0){
                        continue;
                    }
                    int num=digits[k]*100+digits[j]*10+digits[i];
                    sb.add(num);
                }
            }
        }
        return sb.size();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/unique-3-digit-even-numbers/)