class Solution {
    public boolean isPowerOfTwo(int n) {
        // jo n aaya hain vah 2 ke power hain  ke nhi ye batao agar nhi haain to return false karo 
        if(n==0)return false;
        if(n==1) return true;
        // 2 4 6 8
        long  val=2;
        while(val<=n){
            if(val==n) return true;
            val=val*2;
        }
        if(val==n) return true;
        return false;
    }
}