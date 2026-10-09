class Solution {
     int n;  Boolean []dp;
      boolean solve( HashSet<String>set,String s,int idx){
              if(idx==n) return true;  
              if(dp[idx]!=null) return dp[idx]; 
        StringBuilder curr_str=new StringBuilder();
         for(int i=idx ; i<n;i++){
                curr_str.append(s.charAt(i));
                String  c_st= curr_str.toString();

                if(set.contains(c_st))
                {
                    if(solve(set,s,i+1))  return dp[idx]=true;
                }
            }
               return dp[idx]=false;
      }

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String>set=new HashSet<>();
        this.n=s.length();  dp=new Boolean [n]; 
        int m=wordDict.size();
        for(int i=0 ; i< m ;i++){
            set.add(wordDict.get(i));
        }
        return solve(set,s,0);
    }
}