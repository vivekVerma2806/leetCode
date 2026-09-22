class Solution {
    int n; int []dp;
    private int solve(int i ,int []nums){
        if(i>=n) return 0;
         if(dp[i]!=-1) return dp[i];
        // take 
        int take=nums[i]+solve(i+2,nums);
        //skip
        int skip=solve(i+1,nums);
        return dp[i]= Math.max(take,skip);
    }

    public int rob(int[] nums) {
        // if two adjacent house then cll the police
        // ye chori karna + next call main esh adj ko skip 
        // ye chor nhi karna hain  next call main  adj ko include
        n=nums.length; dp=new int[n];
        Arrays.fill(dp,-1);
      return   solve(0,nums);

    }
}