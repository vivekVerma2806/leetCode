class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int top = 0;
        int n = matrix.length;
        int buttom = n - 1;

        int m = matrix[0].length;
        int left = 0;
        int right = m - 1;

        List<Integer> ans = new ArrayList<>();

        while(left <= right && top <= buttom) {

            // left to right
            for(int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // top to buttom
            for(int i = top; i <= buttom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // right to left
            if(top <= buttom) {
                for(int i = right; i >= left; i--) {
                    ans.add(matrix[buttom][i]);
                }
                buttom--;
            }

            // buttom to top
            if(left <= right) {
                for(int i = buttom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}