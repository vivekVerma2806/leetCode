
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;

        if (root == p || root == q) return root;

        TreeNode left_n = lowestCommonAncestor(root.left, p, q);
        TreeNode right_n = lowestCommonAncestor(root.right, p, q);

        if (left_n != null && right_n != null) return root;

        if (left_n == null) return right_n;

        return left_n;
    }
}
