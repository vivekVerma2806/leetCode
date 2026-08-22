class Solution {
    public int searchInsert(int[] nums, int target) {
        
      int n = nums.length;
        // use binary seach 
        int left=0 ; int right = n - 1;
        int mid=0;
        while(left<=right){
            int val=left+(right-left)/2;
            mid=val;
             if(nums[mid]==target) return mid;
             // agar mid bara ho to right ko  kakaro 
             if(nums[mid]>target){
                right=mid-1;
             }else{
                left=mid+1;
             }
        }
       return left;
    }
}