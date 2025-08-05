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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int res=0;
        Stack<TreeNode>q=new Stack<>();
        q.push(root);
        while(!q.isEmpty()){
           TreeNode ans=q.pop(); 
           res++;
           if(ans.left!=null){
            q.push(ans.left);
           }
           if(ans.right!=null){
            q.push(ans.right);
           }
        }
        return res;

    }
}