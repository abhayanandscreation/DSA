
class Solution {
    public boolean exists(TreeNode root , TreeNode val){
        if(root == null) return false;
        if(root == val) return true;
        return exists(root.left , val) || exists(root.right, val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p || root == q) return root;
        boolean pliesinleft = exists(root.left, p);
        boolean qliesinleft = exists(root.left, q);
        if(pliesinleft && qliesinleft) return lowestCommonAncestor(root.left,p,q);
        else if(!pliesinleft && !qliesinleft) return lowestCommonAncestor(root.right , p, q);
        else return root;
    }
}