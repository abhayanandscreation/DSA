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
   /* public void reverse(TreeNode root){
        if(root== null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        reverse(root.left);
        reverse(root.right);
    } */
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p== null && q== null) return true;
        if(p== null || q== null) return false;
        if(p.val!= q.val) return false;
       /* if(!isSameTree(p.left , q.left)) return false;
        if(!isSameTree(p.right , q.right)) return false;
        return true; */
        return isSameTree(p.left, q.right) && isSameTree(p.right , q.left);
    }
    public boolean isSymmetric(TreeNode root) {
         if(root == null) return true;
       // if(root == null) return true;
       // if(root.left == null && root.right == null) return true;
       // if(root.left == null || root.right == null) return false;
        //reverse(root.left);
       return isSameTree(root.left , root.right);
    }
}