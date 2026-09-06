class Solution {
   
   private int  solve(String s , String t, int i,int j,int [][]dp){
        
        if(j==t.length()){
            return 1;
        }
        if(i>=s.length()){
            return 0;
        }
       if(dp[i][j]!=-1){
        return dp[i][j];
       }
        if(s.charAt(i)==t.charAt(j)){
         // take 
          
          int take=   solve(s,t,i+1,j+1,dp);
         // skip     
          int skip=  solve(s,t,i+1,j,dp);
            return dp[i][j]=take+skip;
      }else{
         return dp[i][j]=  solve(s,t,i+1,j,dp);
      }
   
   }

    public int numDistinct(String s, String t) {
        
int [][]dp=new int [s.length()][t.length()];
  for(int i =0 ; i < s.length(); i++){
    for(int j =0 ; j <t.length();j++){
        dp[i][j]=-1;
    }
  }
      int ans =  solve(s,t,0,0,dp);
       return ans;
        
    }
}