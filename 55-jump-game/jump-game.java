class Solution {
    public boolean canJump(int[] nums) {
        
        int maxJump=0; int n=nums.length;
         
         int i=0;
        
         while(i<n){
             if(i==n-1) return true;
            maxJump=Math.max(maxJump,nums[i]);
           
            if(maxJump>0){
                 maxJump--;
                i++;
            }else{
                return false;
            }
         }



       return true;
    }
}