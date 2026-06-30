class Solution {
public:
    int numberOfSubstrings(string s) {

        int count=0;  int left=0; int n =s.size();
        unordered_map<char,int>mp;

        for(int right=0 ; right< n ;right++){
            mp[s[right]]++;
            while(mp['a']>0 && mp['b']>0 && mp['c']>0){
                int ans=n-right; // esh ke baad wale sare ele valid hain
                mp[s[left]]--;
                count+=ans;
                left++;
            }
        }
        return count;
    }
};