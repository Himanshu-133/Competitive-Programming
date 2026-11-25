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