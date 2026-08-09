class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {

        deque<int> dq;
        vector<int> res;

        // First window
        for (int i = 0; i < k; i++) {

            // Remove smaller elements from back
            while (!dq.empty() && nums[dq.back()] <= nums[i]) {
                dq.pop_back();
            }

            dq.push_back(i);
        }

        // Remaining windows
        for (int i = k; i < nums.size(); i++) {

            // Current window ka maximum
            res.push_back(nums[dq.front()]);

            // Window se bahar ho chuke elements remove karo
            while (!dq.empty() && dq.front() <= i - k) {
                dq.pop_front();
            }

            // Naye element se chhote elements remove karo
            while (!dq.empty() && nums[dq.back()] <= nums[i]) {
                dq.pop_back();
            }

            // Naya element add karo
            dq.push_back(i);
        }

        // Last window ka maximum
        res.push_back(nums[dq.front()]);

        return res;
    }
};