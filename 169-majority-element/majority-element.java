class Solution {
    public int majorityElement(int[] nums) {
        int  moj_ele=nums[0];
        int count=0;
        for(int x : nums){
            if(count==0){
                moj_ele=x;
            }
            if(x==moj_ele){
                count++;
            }else{
                count--;
            }
        }
        return moj_ele;
    }
}