class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        
        int min=*min_element(nums.begin(),nums.end());
        int max=*max_element(nums.begin(),nums.end());
        unordered_set<int>st;

        for(int  x : nums){
            st.insert(x);
        }

        //like mujhe min aur max pata hain aur mujhe ab itreate karna hain aur find out karna H
        //hain 
        vector<int>ans;
        for(int i =min ; i<=max;i++){
             //o(1) main koi ele hain wah kaise dekhte hain 
             if(st.find(i)==st.end()){
                ans.push_back(i);
             }
        }
        return ans;
    }
};