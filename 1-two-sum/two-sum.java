class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // unordered map use karo ele then inx ele ko aur find karo targte -ele 
        
        HashMap<Integer,Integer>map=new HashMap<>();
         for(int i = 0  ; i< nums.length ;i++){
            map.put(nums[i],i);
         }

         // key aur value hogya 
         // ab ak ele ko aur find karo 

         for(int i =0 ; i <nums.length ;i++){
            int x=nums[i];
            int val=target-x;

            if(map.containsKey(val)){
                // kart hain 
                int second_idx=map.get(val);
                if(second_idx!=i){
                    return new int [] {i,second_idx};
                }
            }
         }
      return new int[]{};
    }
}