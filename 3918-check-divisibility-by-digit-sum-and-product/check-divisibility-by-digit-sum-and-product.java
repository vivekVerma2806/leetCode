class Solution {
    public boolean checkDivisibility(int n) {
       

       long  sum=0; long pro=1;
      int x=n;
       while(x!=0){
          
          int di=x%10;
          x=x/10;
          sum+=di;
          pro*=di;
       }
      
      long val=sum+pro;

       
       if(n%val==0){
        return true;
       }


return false;
    }
}