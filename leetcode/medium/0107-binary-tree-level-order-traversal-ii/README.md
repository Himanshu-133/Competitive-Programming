# Binary Tree Level Order Traversal II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree, return  *the bottom-up level order traversal of its nodes' values*. (i.e., from left to right, level by level from leaf to root).

 

 **Example 1:** 

```
Input: root = [3,9,20,null,null,15,7]
Output: [[15,7],[9,20],[3]]

```

 **Example 2:** 

```
Input: root = [1]
Output: [[1]]

```

 **Example 3:** 

```
Input: root = []
Output: []

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 2000].
- -1000 <= Node.val <= 1000

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 98.81%)  
**Memory:** 44.3 MB (beats 38.35%)  
**Submitted:** 2026-11-25T20:16:54.739Z  

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //List<Integer>sb=new ArrayList<>();
        List<List<Integer>>ab=new ArrayList<>();
        if(root==null){
            return ab;
        }
        Queue<TreeNode> sb=new LinkedList<>();
        sb.offer(root);
        while(!sb.isEmpty()){
            int size=sb.size();
            List<Integer>pq=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode q=sb.poll();
                pq.add(q.val);
                if(q.left!=null)sb.offer(q.left);
                if(q.right!=null)sb.offer(q.right);

            }
            ab.add(0,pq);
        }
        return ab;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)