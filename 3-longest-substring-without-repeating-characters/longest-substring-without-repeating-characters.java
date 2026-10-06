class Solution {
    public int lengthOfLongestSubstring(String s) {
        // mujhe kuch aise mentain karna pare ga like set agar ush set maai lil gaya to ush se pahle wala kamax count kar lunga 
        int n =s.length();
        int ans=0;
         int i=0; int j=0;
         HashSet<Character>set=new HashSet<>();
         while(j<n){
            while(set.contains(s.charAt(j))){
                  set.remove(s.charAt(i));
                  i++;
            }
            set.add(s.charAt(j));
            ans=Math.max(ans,set.size());
            j++;
         }
        return ans;
    }
}