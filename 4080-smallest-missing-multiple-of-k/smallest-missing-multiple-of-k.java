class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        int misNum=k;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i =0 ; i< n ;i++){
           if(misNum==nums[i]){
            misNum+=k;
           }
        }

        return misNum;
    }
}