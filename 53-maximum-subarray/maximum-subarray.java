class Solution {
    public int maxSubArray(int[] nums) {
        // max_subArray
        int ans=nums[0]; int n=nums.length;
        int sum=0;


        for(int i=0 ;i<n;i++){

              if(sum+nums[i]<0){
                  sum=0;
                  ans=Math.max(ans,nums[i]);
                  
              }else{
                sum+=nums[i];
                ans=Math.max(ans,sum);
              }
        }

        return ans;
    }
}