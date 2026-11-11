class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        dfs(root, path, ans);
        return ans;
    }

    void dfs(TreeNode root, StringBuilder path, List<String> ans) {
        if (root == null) return;
        int len = path.length();
        if (path.length() > 0) {
            path.append("->");
        }
        path.append(root.val);
        if (root.left == null && root.right == null) {
            ans.add(path.toString());
        }
        dfs(root.left, path, ans);
        dfs(root.right, path, ans);
        path.setLength(len);
    }
}