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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> large = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return large;
        q.add(root);
        while( q.size() > 0 ){
        List<Integer> small = new ArrayList<>();
        int Size = q.size();
            for(int i =0; i<Size; i++){
            TreeNode front = q.remove();
            small.add(front.val);
            if(front.left != null){ 
            q.add(front.left);
            }
            if(front.right != null) {
                q.add(front.right);
            }
        }
            large.add(small);
        }
        return large;
    }
}