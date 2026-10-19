class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum=nums[0]; int n=nums.length;
        int currSum=0;
        for(int i=0; i< n; i++){
            if(nums[i]+currSum<0){
                  currSum=0;
                  maxSum=Math.max(nums[i],maxSum);
            }else{
                currSum=nums[i]+currSum;
                maxSum=Math.max(currSum,maxSum);
            }
            
        }
        return maxSum;
    }
}