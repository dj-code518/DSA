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
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftH=height(root.left);
        int rightH=height(root.right);

        return 1 + Math.max(leftH,rightH);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int lefth=height(root.left);
        int righth=height(root.right);

        if(Math.abs(righth-lefth)>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}