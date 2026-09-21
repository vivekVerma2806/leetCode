class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] ans = new long[k];

        // prev[r] = number of subarrays ending at previous index
        // whose product % k == r
        long[] prev = new long[k];

        for (int num : nums) {
            long[] curr = new long[k];

            int x = num % k;

            // Start a new subarray [num]
            curr[x]++;

            // Extend all previous subarrays
            for (int r = 0; r < k; r++) {
                if (prev[r] > 0) {
                    int newR = (r * x) % k;
                    curr[newR] += prev[r];
                }
            }

            // Add subarrays ending here to answer
            for (int r = 0; r < k; r++) {
                ans[r] += curr[r];
            }

            prev = curr;
        }

        return ans;
    }
}