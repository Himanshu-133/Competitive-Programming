# Maximum 69 Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a positive integer `num` consisting only of digits `6` and `9`.

Return  *the maximum number you can get by changing  **at most**  one digit (* `6` *becomes* `9` *, and* `9` *becomes* `6` *)*.

 

 **Example 1:** 

```
Input: num = 9669
Output: 9969
Explanation: 
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.

```

 **Example 2:** 

```
Input: num = 9996
Output: 9999
Explanation: Changing the last digit 6 to 9 results in the maximum number.

```

 **Example 3:** 

```
Input: num = 9999
Output: 9999
Explanation: It is better not to apply any change.

```

 

 **Constraints:** 

- 1 <= num <= 104
- num consists of only 6 and 9 digits.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.1 MB (beats 64.17%)  
**Submitted:** 2026-07-26T18:14:58.213Z  

```java
class Solution {
    public int maximum69Number (int num) {
        char[] digits=String.valueOf(num).toCharArray();
        for(int i=0;i<digits.length;i++){
            if(digits[i]=='6'){
                digits[i]='9';
                break;
            }
        }
        int res=0;
        for(char digit:digits){
            res=res*10+(digit-'0');
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-69-number/)