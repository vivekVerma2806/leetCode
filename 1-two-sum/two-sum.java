class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // two sum dono intx ka sum target ke equ hona chaiye 
        // kaise 
        // can i  use shildimg widow 
        int [] ans=new int[2];
     int n  =  nums.length;
        for(int i =0 ; i < n ;i++){
            int x = target-nums[i];
            
            for(int j = i+1 ;  j <n ; j++){
                if(nums[j]==x){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }
}