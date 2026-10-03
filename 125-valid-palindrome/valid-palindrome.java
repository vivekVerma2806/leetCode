class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        for(char c : s.toCharArray()){

            if(Character.isUpperCase(c)){
                char ch = Character.toLowerCase(c);
                s1+=ch;
            }
            if('a'<=c && c<='z' || '0'<=c && c<='9' ){
                s1+=c;
            }
        }
        // stirng bana gaya 
        String s2=""; int n=s1.length();
        for(int  i=n-1 ; i>=0;i--){
            s2+=s1.charAt(i);
        }

        return s1.equals(s2);
    }
}