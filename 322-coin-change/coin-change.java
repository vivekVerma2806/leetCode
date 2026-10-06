class Solution {
    int n; int [][]dp;
    int solve(int[] coins,int amount,int idx){
        if(amount==0) return 0;
        if(idx==n) return (int)1e9;
        if(amount<0) return (int)1e9;
         if(dp[idx][amount]!=-1) return dp[idx][amount];
        int take=1+solve(coins,amount-coins[idx],idx);
        int skip=solve(coins,amount,idx+1);

        return dp[idx][amount]=Math.min(take,skip);
        
    }

    public int coinChange(int[] coins, int amount) {
        n=coins.length; dp=new int[n+1][amount+1];
        for(int i=0; i< n+1 ;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans=solve(coins,amount,0);
        
        if(ans==(int)1e9)return -1;
        return ans;
    }
}