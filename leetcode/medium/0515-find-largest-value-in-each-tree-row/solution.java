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