class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;

        int maxProfit=0;
          int sell=nums[n-1];
        for(int i=n-1 ;i >=0 ;i--){
            if(sell<nums[i]){
                sell=nums[i];
            }else{
                int currProfit=sell-nums[i];
                maxProfit=Math.max(maxProfit,currProfit);
            }
        } 


        return maxProfit;
        
    }
}