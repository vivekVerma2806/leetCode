class Solution {
    public int findDuplicate(int[] nums) {
       // cycle sort use ho raha hain 
       int i=0 ; int n=nums.length;
       while(i<n){
         int correct_idx=nums[i];
         // check karna hain  ke ush ele par aagr vah ele pahle hi hain to vah answer hoga 
         if(nums[correct_idx]==nums[i]) return nums[i];
         int temp=nums[i];
         nums[i]=nums[correct_idx];
         nums[correct_idx]=temp;

       }

       return 0;
    }
}