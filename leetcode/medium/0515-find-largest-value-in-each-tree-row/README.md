# Find Largest Value in Each Tree Row

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree, return  *an array of the largest value in each row*  of the tree  **(0-indexed)**.

 

 **Example 1:** 

```
Input: root = [1,3,2,5,3,null,9]
Output: [1,3,9]

```

 **Example 2:** 

```
Input: root = [1,2,3]
Output: [1,3]

```

 

 **Constraints:** 

- The number of nodes in the tree will be in the range [0, 104].
- -231 <= Node.val <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 88.83%)  
**Memory:** 47.5 MB (beats 46.57%)  
**Submitted:** 2026-09-15T19:56:40.320Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>sb =new ArrayList<>();
        if(root==null){
            return sb;
        }
        Queue<TreeNode> ans=new LinkedList<>();
        ans.offer(root);
        while(!ans.isEmpty()){
            int n=ans.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                TreeNode a=ans.poll();
                max=Math.max(max,a.val);
                if(a.left!=null){
                    ans.offer(a.left);
                }
                if(a.right!=null){
                    ans.offer(a.right);
                }
            }
            sb.add(max);
        }
        return sb;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-largest-value-in-each-tree-row/)