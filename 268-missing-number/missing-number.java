class Solution {
    public int missingNumber(int[] nums) {
        // o  1 main  aur nums 1 sort nhi 
        int n=nums.length;
        
        int sum=(n*(n+1))/2;

        int sum2=0;
        for(int val : nums){
            sum2+=val;
        }
         return sum-sum2;
    }
}