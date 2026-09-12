class Solution {
     
     private void swap(int a ,int b ,char[] s){
        // yaha par do indx aaya hain esh ko  kaise swap  karrna hain \
         char temp=s[a];
         s[a]=s[b];
         s[b]=temp;
     }

    public void reverseString(char[] s) {
        
        // Array of char hain  esh  ko revsre karna hain last swap karna haimn
        // 0 1 2 3 4 
        int left =0; int right =s.length-1;
       // if(right==0) return;
        while(left<right){
            swap(left,right,s);
            left++; right--;
        }

        return ;
    }
}