class Solution {
    public int removeDuplicates(int[] nums) {

            ArrayList<Integer>arr=new ArrayList<>();
             int n = nums.length;
             int prev=nums[0];

            for(int i = 1 ; i < n ; i++){
                // agar prev ele aur currele same ho to curr prev ban jaiye ga 
                 if(prev==nums[i]){
                    prev=nums[i];
                 }else{
                    arr.add(prev);
                    prev=nums[i];
                 }
            }  
        arr.add(prev);
       int ans=arr.size();
       
       for(int i = 0 ; i < ans ; i++){
        nums[i]=arr.get(i);
       }
     
       return ans;

    }
}