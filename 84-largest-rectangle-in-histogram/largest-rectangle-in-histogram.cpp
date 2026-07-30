class Solution {
public:
    int largestRectangleArea(vector<int>& h) {
        int n = h.size();

        vector<int> nextsmall(n, n);
        vector<int> prevsmall(n, -1);

        stack<int> st;

        // Next Smaller Index
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && h[st.top()] >= h[i]) {
                st.pop();
            }

            if (!st.empty()) {
                nextsmall[i] = st.top();
            }

            st.push(i);
        }

        while (!st.empty()) st.pop();

        // Previous Smaller Index
        for (int i = 0; i < n; i++) {
            while (!st.empty() && h[st.top()] >= h[i]) {
                st.pop();
            }

            if (!st.empty()) {
                prevsmall[i] = st.top();
            }

            st.push(i);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int width = nextsmall[i] - prevsmall[i] - 1;
            int area = h[i] * width;
            ans = max(ans, area);
        }

        return ans;
    }
};