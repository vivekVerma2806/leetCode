class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n=strs.length; String ans=strs[0];

        for(int i=1;i<n;i++){
            
            int j=0; String CurrMatch="";

            while(j<ans.length() && j<strs[i].length() && strs[i].charAt(j)==ans.charAt(j)){
                CurrMatch+=ans.charAt(j);
                 j++;
            }
         
             ans=CurrMatch;
        }
        return ans;
    }
}