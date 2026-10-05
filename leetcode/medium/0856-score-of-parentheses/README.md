# Score of Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a balanced parentheses string `s`, return  *the  **score**  of the string*.

The  **score**  of a balanced parentheses string is based on the following rule:

- "()" has score 1.
- AB has score A + B, where A and B are balanced parentheses strings.
- (A) has score 2 * A, where A is a balanced parentheses string.

 

 **Example 1:** 

```
Input: s = "()"
Output: 1

```

 **Example 2:** 

```
Input: s = "(())"
Output: 2

```

 **Example 3:** 

```
Input: s = "()()"
Output: 2

```

 

 **Constraints:** 

- 2 <= s.length <= 50
- s consists of only '(' and ')'.
- s is a balanced parentheses string.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 61.96%)  
**Memory:** 43.1 MB (beats 12.37%)  
**Submitted:** 2026-10-05T15:52:54.971Z  

```java
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> sb=new Stack<>();
        sb.push(0);
        for(char ch:s.toCharArray()){
            if(ch=='('){
                sb.push(0);
            }else{
                int inner=sb.pop();
                if(inner==0){
                    sb.push(sb.pop()+1);
                }else{
                    sb.push(sb.pop()+2*inner);
                }
            }
        }
        return sb.pop();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/score-of-parentheses/)