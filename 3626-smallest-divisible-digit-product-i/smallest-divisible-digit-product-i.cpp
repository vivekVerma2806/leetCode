class Solution {
public:
    int smallestNumber(int n, int t) {
        // aise bara number chaiye jo n se bare ho aur ush ka digit ka prodect t se divi ho 
        
        
       // ak number chose karana hain jo n se bare ho aur t se

       int ans=n;
         bool check=true;
         while(check){  
              int diPro=1;
              int num=ans;
              while(num){
                int d=num%10;
                diPro*=d;
                num=num/10;
              }
             // yahha check karna hain vah number 
            if(diPro%t==0){
                check=false;
                break;
            }else{
                ans++;
            }
         }
        
      return ans;
    }    
    
};