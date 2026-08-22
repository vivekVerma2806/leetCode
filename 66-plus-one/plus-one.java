class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        // last main  9  se kam hain to +1  kar do
         if(digits[n-1]<9){
            digits[n-1]++;
            return digits;
         }


         // case --3 jab sare  digits 9999 ho 
        boolean all_nine=true;
        for(int i =0 ; i< n ;i++){
            if(digits[i]!=9){
                all_nine=false;
                break;
            }
        }


      if(all_nine) { int[] ans = new int[digits.length + 1];
        ans[0]=1;
        for(int i=1; i< n ;i++){
           ans[i]=0;
        }
  return ans;}
        //case--3 jab sare last wale digits 9 ho aur last wala 9 nhi ho to 
         
              int i =1;
              while(digits[n-i]==9){
                  digits[n-i]=0;
                  i++;
              }
              digits[n-i]+=1;
              return digits;
         

      
    }
}