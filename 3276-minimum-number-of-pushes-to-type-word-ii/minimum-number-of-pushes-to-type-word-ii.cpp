class Solution {
public:
    int minimumPushes(string word) {
        // mujhe diff word diya gaye hain aur mujhe jo word jade bar aaye hain usko frist dena 
        // hoga then uske accoding 
        // step 1 freq ke accoding soet hogaya 
         unordered_map<char, int> freq;
            for (char ch : word) {
                      freq[ch]++;
                  }
           vector<pair<char,int>>v(freq.begin(),freq.end());
           sort(v.begin(),v.end(),[](auto &a ,auto &b){
                 return a.second > b.second;
           });
        // ab 1--8 tak ke char ko jo jade freq wale hain usko 1 dete hain 
        // 9--16 tak wale char ko 2 dena hogaya 
        // 17-24 wale ko 3 dena hogaya 
        // 25--26 wale ko 4 dena hogaya 
        
        // char aur uska rank dal dete hain 
        unordered_map<char,int>rank;
        int count=1;
        for(auto it : v){
            // it.first== char 
            if(count<=8){
                rank[it.first]=1;
            }else if( 8 < count &&count<=16){
                 rank[it.first]=2;
            }else if(16<count && count<=24){
                rank[it.first]=3;
            }else{
                rank[it.first]=4;
            }
            count++;
        }
        int ans=0;
         for(char ch : word){
            ans+=rank[ch];
         }
        return ans;
    }
};