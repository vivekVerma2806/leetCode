class Solution {
public:
    int minimumPushes(string word) {
        int n = word.size();
        
        if(n<=8){
            return n ;
        }else if(  8 < n    && n<=16){
           return (((n-8 )*2)+8);
        }else if(16 < n && n<=24){
            return (24+((n-16)*3));
        }else {
            return  (48+((n-24)*4));
        }


    }
};