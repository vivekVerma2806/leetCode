class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int   x: nums){
            set.add(x);
        }
        int ans=0;
        for(int x : set){
           /// dekho ke agar x pahle wala persent hain  to start nhi karn hain Q
           // Agar x - 1 se persent nhi hain  tab start karo
            int count=0;
           if(!set.contains(x-1)){
              int curr=x;
              while(set.contains(curr)){
                curr++; count++;
              }
           }
           ans=Math.max(count,ans);
        }

        return ans;
    }
}