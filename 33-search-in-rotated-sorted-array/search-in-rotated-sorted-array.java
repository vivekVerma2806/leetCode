class Solution {
    public int search(int[] nums, int target) {


        int i=0 ;  int r=nums.length-1;
        while(i<=r){
            int mid=i+(r-i)/2;
            if(nums[mid]==target) return mid;
            //left haft 
            if(nums[i]<=nums[mid] ){
                // mid se chota aur i se bara hain r ko chota karu ga 
                if(nums[mid]>=target && nums[i]<=target){
                    r=mid-1;
                }else{
                    i=mid+1;
                }

            }else{
                // agar mid se bar aur last de chota ya equal
               if(nums[mid]<target && target<=nums[r]){
                    i=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}