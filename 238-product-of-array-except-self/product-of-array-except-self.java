class Solution {
    public int[] productExceptSelf(int[] nums) {

        // muhje max product chaiye ok na then kaise kya karna hoga thinkk
        // first of all product all the num
        int n=nums.length;int []ans=new int [n];
        int pro=1; int count =0;
        int pro1=1;
         for(int i=0; i<n ;i++){
            if(nums[i]==0){ count++;
            }else{
                pro1*=nums[i];
            }
            pro*=nums[i];
         }
         for(int i=0; i< n ; i++){

            if(nums[i]==0 && count>1){
                ans[i]=0;
            }
            if(nums[i]==0 && count==1){
                ans[i]=pro1;
            }
           if(nums[i]!=0) {ans[i]=pro/nums[i];}
         }
        return ans;
    }
}