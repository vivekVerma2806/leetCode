class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        // ele aur ush ka count 
        unordered_map<int,int>feq;
        for(int num : nums){
            feq[num]++;
        }
        //ak Queue bana aur ush main dal do 
      priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>>minheap;
    
      for(auto it : feq){
        int ele=it.first;
        int count=it.second;
        // hame count ke base par ans nikalan hain
        minheap.push({count,ele});
        while(minheap.size()>k){
            minheap.pop();
        }
      }
// ab minheap mai k size ke jitne bhi ele hain jiese feq jase hain vah rahe ga 
    vector<int>ans;
    while(!minheap.empty()){
        auto it =minheap.top();
        ans.push_back(it.second);
        minheap.pop();
    }
return ans;
    }
};