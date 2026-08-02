class Solution {
public:
    int solve(int i , int j , vector<int>&p,vector<vector<int>>&dp){
        if(i>j){
            return 0;
        }
        if(i==j){
            return p[i];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int st=p[i] + min(solve(i+2,j,p,dp) ,solve(i+1,j-1,p,dp));

        int end=p[j] +min(solve(i+1,j-1,p,dp),solve(i,j-2,p,dp));
        return dp[i][j]=max(st,end);
    }

    bool stoneGame(vector<int>& piles) {
        int t_sum=0;
        for(int x : piles){
             t_sum+=x;
        }
        int n=piles.size();
        vector<vector<int>>dp(n,vector<int>(n,-1));
        int Alice=solve(0 ,n-1,piles,dp);
        int Bob=t_sum-Alice;

        return Alice>Bob;
    }
};