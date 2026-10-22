class Solution {
    public int countPrimes(int n) {

        int []isPrime=new int [n+1]; Arrays.fill(isPrime,0);

        for(int i=2 ;i*i<=n ;i++){
            for(int j=i*i ; j<n; j+=i ){
                isPrime[j]=1;
            }
        }
         int count=0;
        for(int i =2 ; i< n ;i++){
          if(isPrime[i]==0) count++;
        }
        return count;
    }
}