class Solution {
    int m, n;
    Boolean[][][] dp;

    boolean solve(int i, int j, char[][] grid, int balance) {

        if (i >= m || j >= n)
            return false;

        balance += (grid[i][j] == '(') ? 1 : -1;

        // Invalid balance
        if (balance < 0)
            return false;

        // Destination
        if (i == m - 1 && j == n - 1)
            return balance == 0;

        // Already calculated
        if (dp[i][j][balance] != null)
            return dp[i][j][balance];

        return dp[i][j][balance] =
            solve(i + 1, j, grid, balance) ||
            solve(i, j + 1, grid, balance);
    }

    public boolean hasValidPath(char[][] grid) {
        m = grid.length;
        n = grid[0].length;

        dp = new Boolean[m][n][m + n + 1];

        return solve(0, 0, grid, 0);
    }
}