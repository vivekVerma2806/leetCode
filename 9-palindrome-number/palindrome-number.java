class Solution {
    public boolean isPalindrome(int x) {
        // esh ko copy karna hain 
        int num=x;
         int rev=0;
        while(x>0){
            int di=x%10;
            x=x/10;
            rev=rev*10+di;
        }

        return rev==num;
    }
}