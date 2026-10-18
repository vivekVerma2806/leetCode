class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n=strs.length;
        String ans=strs[0];
        if(n==1) return ans;
        for(int i=1 ; i< n;i++){
            String currStr="";
            int j=0;
            while(j< strs[i].length() && j < ans.length() && strs[i].charAt(j)==ans.charAt(j)){
                j++;
            }
            currStr=strs[i].substring(0,j);
            ans=currStr;
        }

        return ans;
    }
}