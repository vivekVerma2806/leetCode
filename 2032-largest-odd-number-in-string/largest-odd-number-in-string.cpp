class Solution {
public:
    string largestOddNumber(string num) {
        // mujhe ak string de gaye hain 
        // kya return karna hain  old largest integer 
        // kaise .... bruth_forces
        //last idx se aana hain aur jaha old mil jaiye waha ruk jana hain aur 0  se vaha tak ka sub str return kar dena hain 
         int idx=-1;
         for(int i =num.size()-1 ; i>=0 ; i--){
            // char le  hain  aur ush char ko Inger main covert karna hain  
            int val=num[i]-'0';
            //odd hone par main  break kar diya hu aur idx ko update kar diya hu
            if(val&1){
                idx=i;
                break;
            }

         }

         if(idx==-1){
            return "" ;
         }else{
           string  ans=num.substr(0,idx+1);
            return ans;
         }

      
    }
};