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
    int count=0;
    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return count;
    }
    private int dfs(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int leftmax=dfs(root.left);
        int rightmax=dfs(root.right);
        int subtree=Math.max(root.val,Math.max(leftmax,rightmax));
        if(root.val==subtree){
            count++;
        }
        return subtree;
    }
}