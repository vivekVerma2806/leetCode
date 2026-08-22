class Solution {
    public int removeDuplicates(int[] nums) {

            ArrayList<Integer>arr=new ArrayList<>();
              

              int n = nums.length ; 

              int j =0 ; 
              for(int i = 1 ; i < n  ;i ++){
                if(nums[i-1]!=nums[i]){
                    j++;
                    nums[j]=nums[i];
                }
              }

              return j+1 ;


    }
}