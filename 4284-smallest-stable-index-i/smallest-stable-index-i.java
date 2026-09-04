class Solution {
    public int firstStableIndex(int[] nums, int k) {
        //har ak i  ke  liye ak score diffine hain  max(0....i)-min(i...n-1) tak 
        // stable if scroe < k  aur sabse chota score do 
        // mtb mujhe 1 array banee hoga i  se n-1 tak ka rahe 
        int n =nums.length;
        int [] small= new int [n];
        int small_val=nums[n-1];

       // yaha par small value har diye har idx ke liye n-1 to i tak ke liye 
        for(int i =n-1 ; i>=0 ;i--){
            small_val=Math.min(small_val,nums[i]);
            small[i]=small_val;
        }
         
        int max_val=nums[0];
        

        for(int i  =0; i<n ; i++){
            // i se 0 to i tak ka max value 
            max_val=Math.max(max_val,nums[i]);
            // yaha  par score 
            int sc=max_val-small[i];
            // 
            if(sc<=k){
               return i ;
            }

        } 
    return  -1;
    }
}