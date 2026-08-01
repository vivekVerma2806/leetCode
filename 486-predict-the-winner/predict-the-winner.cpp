class Solution {
public:

int  solve(int i  , int j,vector<int>&nums, vector<vector<int>>&dp){
   
    if(i>j){
        return 0;
    }
    if(i==j){
        return nums[i];
    }
 if(dp[i][j]!=-1){
        return dp[i][j];
    }
    // yaha par p2 aise choose kare ga ke player 1 ko min mile thats way min lagya hu 
    // aur slove fun bata p1 ko max mile 
  int take_i = nums[i] + min(
    solve(i+2, j, nums,dp),
    solve(i+1, j-1, nums,dp)
);

  int   take_j = nums[j] + min(
    solve(i+1, j-1, nums,dp),
    solve(i, j-2, nums,dp)
);

    return dp[i][j]=max(take_i,take_j);
}

    bool predictTheWinner(vector<int>& nums) {
        int t=0;
        for(int x : nums){
            t+=x;
        }
        int n =nums.size();
        vector<vector<int>>dp(n,vector<int>(n,-1));
       int  ps1=solve(0,n-1,nums,dp);
       int  ps2=t-ps1;
        return ps1>=ps2;
    }
};