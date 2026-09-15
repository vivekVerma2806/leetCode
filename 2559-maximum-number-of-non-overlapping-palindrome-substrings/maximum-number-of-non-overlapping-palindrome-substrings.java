import java.util.*;

class Solution {

    int[][] dp;

    private boolean isPal(String s, int i, int j) {

        while (i < j) {

            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }

    private int solve(String s, int i, int j, int k) {

        int n = s.length();

        if (i >= n || j >= n) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (isPal(s, i, j)) {

            int take = 1 + solve(s, j + 1, j + k, k);
            int grow = solve(s, i, j + 1, k);
            int slide = solve(s, i + 1, j + 1, k);

            return dp[i][j] =
                    Math.max(take, Math.max(grow, slide));
        }

        int grow = solve(s, i, j + 1, k);
        int slide = solve(s, i + 1, j + 1, k);

        return dp[i][j] =
                Math.max(grow, slide);
    }

    public int maxPalindromes(String s, int k) {
          
        int n = s.length();
        if(k==1) return n;

        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(s, 0, k - 1, k);
    }
}