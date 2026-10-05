class Solution {
    public int strStr(String haystack, String needle) {
        
        int n =haystack.length();
        int left=0; int right=needle.length();
        while(right<=n){

           if(haystack.substring(left,right).equals(needle)){
              return left;
           }else{
            left++;
            right++;
           }
        }

        return -1;
    }
}