class Solution {
    public String largestOddNumber(String num) {
        int idx=-1;  
        for(int i = num.length()-1 ; i>=0 ; i--){
            int val=num.charAt(i)-'0';
            
            if((val&1)==1){
                idx=i;
                break;
            }
        }
        return idx==-1 ? "" : num.substring(0,idx+1);
    }
}