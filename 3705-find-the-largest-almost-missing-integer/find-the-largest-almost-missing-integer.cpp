class Solution {
public:
    int largestInteger(vector<int>& nums, int k) {
        int n = nums.size();

        if (k == 1) {
            unordered_map<int, int> freq;

            for (int x : nums)
                freq[x]++;

            int ans = -1;

            for (auto [x, f] : freq) {
                if (f == 1)
                    ans = max(ans, x);
            }

            return ans;
        }

        if (k == n) {
            return *max_element(nums.begin(), nums.end());
        }

        int ans = -1;

        if (count(nums.begin(), nums.end(), nums[0]) == 1)
            ans = max(ans, nums[0]);

        if (count(nums.begin(), nums.end(), nums[n - 1]) == 1)
            ans = max(ans, nums[n - 1]);

        return ans;
    }
};