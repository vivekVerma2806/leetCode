class Solution {
    public boolean isPowerOfTwo(int n) {
        // jo n aaya hain vah 2 ke power hain  ke nhi ye batao agar nhi haain to return false karo 
        if(n<=0) return false;
       return (n&(n-1))==0 ? true : false;
    }
}