class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] small=new int[n];
        int small_val=nums[n-1];
        for(int i = n-1 ;i >= 0; i--){
             small_val=Math.min(small_val,nums[i]);
            small[i]=small_val;
        }
        int max_val=nums[0];
        for(int i=0 ;i<n; i++){
            max_val=Math.max(max_val,nums[i]);
            int sc=max_val-small[i];
            if(sc<=k){
                return i;
            }
        }
        return -1;
    }
}