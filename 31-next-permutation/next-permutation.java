class Solution {
    void rev(int []nums ,int i ,int j){
         while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++; j--;
         }
    }     

    public void nextPermutation(int[] nums) {
        
         // privot ele find  out karo 
         int p_idx=-1; int n =nums.length;

         for(int i=n-2; i>=0 ; i--){
             if(nums[i]<nums[i+1]){
                p_idx=i;
                break;
             }
         }
         
         // pure rev order main  sorted hain  
         if(p_idx==-1){
             rev(nums,0,n-1);
             return; 
         }
         //swap karma hain
         for(int i=n-1 ;i>=0 ;i--){
            if(nums[i]>nums[p_idx]){
                int temp=nums[i];
                nums[i]=nums[p_idx];
                nums[p_idx]=temp;
                break;
            }
         }
       rev(nums,p_idx+1,n-1);
       return;    
    }
}