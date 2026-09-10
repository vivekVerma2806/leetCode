class Solution {

    int averageSum(TreeNode root) {
        if (root == null) return 0;

        return root.val
             + averageSum(root.left)
             + averageSum(root.right);
    }

    int count(TreeNode root) {
        if (root == null) return 0;

        return 1 + count(root.left) + count(root.right);
    }
    int answer=0;
     void solve(TreeNode root) {
        if (root == null) return;

        int sum = averageSum(root);
        int count = count(root);

        int avg = sum / count;

        if (root.val == avg) {
            answer++;
        }

        solve(root.left);
        solve(root.right);
    }


    public int averageOfSubtree(TreeNode root) {
        
      solve(root);
     return answer;
    }
}