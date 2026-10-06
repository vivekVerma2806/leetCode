class Solution {
    public int subarraySum(int[] nums, int k) {

        int n =nums.length; int count=0;
        int [] prefix=new int [n]; prefix[0]=nums[0];
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=1 ;i < n ;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int j=0 ;j< n;j++){
           
            int need=prefix[j]-k;

            if(mp.containsKey(need)){
                count+=mp.get(need);
            }

            mp.put(prefix[j],mp.getOrDefault(prefix[j],0)+1);

            if(prefix[j]==k){
                count++;
            }
        }
        return count;
    }
}