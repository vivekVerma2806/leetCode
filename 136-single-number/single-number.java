class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int x : nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        for(int x : nums){
            if(freq.get(x)==1){
                return x;
            }
        }

        return -1;
    }
}