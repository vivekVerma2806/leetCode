class Solution {
    public int subarraySum(int[] nums, int k) {
         int n=nums.length;
         int count=0;  int sum=0;
         HashMap<Integer,Integer>mp=new HashMap<>();
         for(int i=0 ;i<n ;i++){
             sum+=nums[i];
             int need=sum-k;
             if(sum==k){
                count++;
             }
             if(mp.containsKey(need)){
                count+=mp.get(need);
             }

             mp.put(sum,mp.getOrDefault(sum,0)+1);
         }
        return count;
        
    }
}