class Solution {
    public int maxSubArray(int[] nums) {
        int n =nums.length;
        // maxSum pcuh hain subArray ka to kaise karo  kandale Algortim 

        int currSum=0;  int maxSum=Integer.MIN_VALUE; 
        for(int i =0 ; i < n ; i++){
            // ye current sum ka vslue le liya hain  
            currSum+=nums[i];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
      return maxSum;
    }
}