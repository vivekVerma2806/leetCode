class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int>mp;//nums2 ke value aur ush value ke rgiht side main next greater ele 
        stack<int>st;
        for(int i = nums2.size()-1 ; i>=0; i--){

              while (!st.empty() && st.top() <= nums2[i]) {
                st.pop();
            }

             // If stack is empty, no greater element exists
            if (st.empty()) {
                mp[nums2[i]] = -1;
            } else {
                mp[nums2[i]] = st.top();
            }

            st.push(nums2[i]);
        }
      vector<int>ans;
        for(int num : nums1){
             ans.push_back(mp[num]);
        }

        return ans;
    }
};