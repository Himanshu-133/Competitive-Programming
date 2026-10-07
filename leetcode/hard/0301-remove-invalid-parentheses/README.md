# Remove Invalid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string `s` that contains parentheses and letters, remove the minimum number of invalid parentheses to make the input string valid.

Return  *a list of  **unique strings**  that are valid with the minimum number of removals*. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "()())()"
Output: ["(())()","()()()"]

```

 **Example 2:** 

```
Input: s = "(a)())()"
Output: ["(a())()","(a)()()"]

```

 **Example 3:** 

```
Input: s = ")("
Output: [""]

```

 

 **Constraints:** 

- 1 <= s.length <= 25
- s consists of lowercase English letters and parentheses '(' and ')'.
- There will be at most 20 parentheses in s.

## Solution

**Language:** Java  
**Runtime:** 149 ms (beats 22.96%)  
**Memory:** 43 MB (beats 99.75%)  
**Submitted:** 2026-10-07T19:35:35.979Z  

```java
class Solution {
    Set<String> res= new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int l=0,r=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                l++;
            }else if(c==')'){
                if(l>0){
                    l--;
                }else{
                    r++;
                }
            }
        }
        backtrack(s,0,l,r,0,new StringBuilder());
        return new ArrayList<>(res);
    }
    private void backtrack(String s,int idx,int l,int r,int balance,StringBuilder current){
        if(idx==s.length()){
            if(l==0 && r==0 && balance==0){
                res.add(current.toString());
            }
            return;
        }
        char ch=s.charAt(idx);
        if(ch=='(' && l>0){
            backtrack(s,idx+1,l-1,r,balance,current);
        }
        if(ch==')' && r>0){
            backtrack(s,idx+1,l,r-1,balance,current);
        }
        current.append(ch);
        if(ch=='('){
            backtrack(s,idx+1,l,r,balance+1,current);
        }else if(ch==')'){
            if(balance>0)backtrack(s,idx+1,l,r,balance-1,current);
        }else{
            backtrack(s,idx+1,l,r,balance,current);
        }
        current.deleteCharAt(current.length()-1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-invalid-parentheses/)