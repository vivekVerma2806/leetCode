class Solution {
public:
    vector<int> validSequence(string word1, string word2) {

        int n = word1.size();
        int m = word2.size();

        // last[j] = word2[j] ko word1 me
        // right side se match karne par uska index
        vector<int> last(m, -1);

        int i = n - 1;
        int j = m - 1;

        // Suffix information
        while (i >= 0 && j >= 0) {

            if (word1[i] == word2[j]) {
                last[j] = i;
                j--;
            }

            i--;
        }

        vector<int> ans;

        j = 0;

        // Ek hi mismatch allowed hai
        bool changed = false;

        // Greedy: left se smallest index choose karo
        for (i = 0; i < n && j < m; i++) {

            // Case 1: exact match
            if (word1[i] == word2[j]) {

                ans.push_back(i);
                j++;
            }

            // Case 2: mismatch use kar sakte hain
            else if (!changed &&
                     (j == m - 1 || i < last[j + 1])) {

                ans.push_back(i);

                changed = true;
                j++;
            }
        }

        if (j == m)
            return ans;

        return {};
    }
};