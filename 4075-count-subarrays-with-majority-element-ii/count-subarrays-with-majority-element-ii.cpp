class Solution {
public:
    long long countMajoritySubarrays(vector<int>& nums, int target) {

        unordered_map<int,int> mp;
        mp[0] = 1;

        int cumSum = 0;
        int leftValidSubArray = 0;
        long long ans = 0;

        for(int i = 0; i < nums.size(); i++) {

            if(nums[i] == target) {
                leftValidSubArray += mp[cumSum];
                cumSum++;
            }
            else {
                cumSum--;
                leftValidSubArray -= mp[cumSum];
            }

            ans += leftValidSubArray;

            mp[cumSum]++;
        }

        return ans;
    }
};