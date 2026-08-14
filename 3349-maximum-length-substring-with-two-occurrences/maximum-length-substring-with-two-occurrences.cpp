class Solution {
public:
    int maximumLengthSubstring(string s) {
        // har char almsot 2 bar aaya ho mtb 2 se jade nhi 
        unordered_map<char,int>freq;
        int left=0;  int ans=0;
        for(int right =0 ;right<s.size() ;right++){
           freq[s[right]]++;
           // char count hogaya 
           // agar vah char 2 bar se jade baaye wale ho to widow ka size kam karo
           while(freq[s[right]]>2){
             freq[s[left]]--;
             left++;
           }
           ans=max(ans,right-left+1);
        }
        return ans;
    }
};