class Solution {
    public int longestValidParentheses(String s) {
        int ans =0;
        int open=0; int close=0;
        //left to right 
        for(char ch :  s.toCharArray()){
            if(ch=='('){
                open++;
            }
            if(ch==')'){
                close++;
            }
            if(open==close){
                ans=Math.max(ans,open+close);
            }
            if(close>open){
                open=0;
                close=0;
            }
        
        }
        /// right to left
        int ropen=0; int rclose=0; int n=s.length();
        for(int i=n-1; i>=0;i--){
            if(s.charAt(i)==')'){
                rclose++;
            }
            if(s.charAt(i)=='('){
                ropen++;
            }
            if(rclose==ropen){
                ans=Math.max(ans,rclose+ropen);
            }
            if(ropen>rclose)
            {
                ropen=0; rclose=0;
            }
        }
           return ans;
        
    }
}