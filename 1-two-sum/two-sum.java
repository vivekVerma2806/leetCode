class Solution {
    public int[] twoSum(int[] nums, int target) {
          HashMap<Integer,Integer>mp=new HashMap<>(); int []ans=new int [2];

          int n=nums.length;

          for(int i=0;i<n ;i++)
          {
             int need=target-nums[i];
             if(mp.containsKey(need)){
                    ans[0]=i;
                    ans[1]=mp.get(need);
                    break;
             }else{
                 mp.put(nums[i],i);
             }
          }


         return ans;
    }
}