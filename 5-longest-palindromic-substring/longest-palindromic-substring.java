class Solution {
     Boolean [][]dp;
     boolean isCheck(int i ,int j ,String s){
         if(i>=j) return true;
          if(dp[i][j]!=null) return dp[i][j]; 
         if(s.charAt(i)==s.charAt(j)){
            i++;j--;
            return dp[i][j]= isCheck(i,j,s);
         }else{
              return dp[i][j]= false;
         }
    
     }


    public String longestPalindrome(String s) {
        int sp=0; int maxLen=0;  int n=s.length();
        dp=new Boolean[n][n];
        for(int i=0 ; i < n ;i++){
            for(int j=i;j< n;j++){
                if(isCheck(i,j,s) && maxLen<j-i+1){
                       maxLen=j-i+1;
                       sp=i;
                }
            }
        }
        return s.substring(sp,sp+maxLen); 
    }
}