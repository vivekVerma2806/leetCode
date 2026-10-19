class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer>map=new HashMap<>();

         int n=nums.length;
         int i=0;
          int []ans=new int [2];
         while(i<n){
            int need=target-nums[i];
            if(map.containsKey(need)){
                int idx=map.get(need);
                ans[0]=idx; ans[1]=i;
                return ans;
            }
            map.put(nums[i],i);
            i++;
         }
         
         return ans;
        
    }
}