class Solution {
public:

    int n;
   int t[2][101][101];
    int solve(bool A, int idx, int M, vector<int>& piles) {

        if (idx >= n) {
            return 0;
        }
        
        int maxTake = min(2 * M, n - idx);

        int result = A==true ? 0 : INT_MAX;

        int stone = 0;
       if(t[A][idx][M]!=-1){
        return t[A][idx][M];
       }
        for (int i = 1; i <= maxTake; i++) {

            // Current player i piles le raha hai
            stone += piles[idx + i - 1];

            if (A) {

                // Alice le rahi hai
                // Alice ke score mein stone add hoga
                int val = stone +
                          solve(false,
                                idx + i,
                                max(M, i),
                                piles);

                result = max(result, val);

            } else {

                // Bob le raha hai
                // Bob ke stones Alice ke score mein add nahi honge
                int val = solve(true,
                                idx + i,
                                max(M, i),
                                piles);

                result = min(result, val);
            }
        }

        return t[A][idx][M]= result;
    }

    int stoneGameII(vector<int>& piles) {

        n = piles.size();
       memset(t,-1,sizeof(t));
        return solve(true, 0, 1, piles);
    }
};