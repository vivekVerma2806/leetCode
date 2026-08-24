class Solution {
    
    private int solve( int idx , int []prefix,int []dp){
           
          if (dp[idx]!=Integer.MIN_VALUE )return dp[idx];

           if(idx==prefix.length-1) return prefix[idx];

           //
           int take =prefix[idx]-solve(idx+1,prefix,dp);

           int skip=solve(idx+1,prefix,dp);

           return  dp[idx]=Math.max(take,skip);
    }

    public int stoneGameVIII(int[] stones) {
     
     //make prefix 
     int n = stones.length;
     int []prefix=new int[n];
     prefix[0]=stones[0];
     for(int i = 1 ; i < n ; i++){
        prefix[i]=prefix[i-1]+stones[i];
     }
    int []dp=new int[n];
    Arrays.fill(dp,Integer.MIN_VALUE);
     return solve(1,prefix,dp);
    }
}