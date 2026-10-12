class Solution {
    

    public boolean isSubsequence(String s, String t) {
        
        int s_l=s.length(); int n=t.length();
         int i=0; int j=0; 
        while(j<n && i<s_l){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
       
       return s_l==i; 
    }
}