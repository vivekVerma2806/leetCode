class Solution {
public:
    vector<int> remainingMethods(int n, int k, vector<vector<int>>& invocations) {

        // Step 1: Graph banao
        vector<vector<int>> adj(n);

        for (auto &it : invocations) {
            adj[it[0]].push_back(it[1]);
        }

        // Step 2: BFS se saare suspicious methods find karo
        vector<bool> suspicious(n, false);

        queue<int> q;
        q.push(k);
        suspicious[k] = true;

        while (!q.empty()) {

            int node = q.front();
            q.pop();

            for (int nei : adj[node]) {

                if (!suspicious[nei]) {
                    suspicious[nei] = true;
                    q.push(nei);
                }
            }
        }

        // Step 3:
        // Har edge check karo.
        //
        // Agar koi edge
        // non-suspicious -----> suspicious
        // milti hai,
        //
        // to suspicious methods ko remove nahi kar sakte.
        //
        // Example:
        // 0 -> 1
        // k = 1
        //
        // suspicious = {1}
        // 0 non-suspicious hai.
        // 1 suspicious hai.
        //
        // Agar 1 remove kar diya to 0 ka call toot jayega.
        // Isliye poora project return karna padega.

        for (auto &it : invocations) {

            int u = it[0];
            int v = it[1];

            if (!suspicious[u] && suspicious[v]) {

                vector<int> ans;

                // Kisi bhi method ko remove nahi kar sakte
                for (int i = 0; i < n; i++)
                    ans.push_back(i);

                return ans;
            }
        }

        // Step 4:
        // Agar upar wali condition kabhi nahi mili,
        // to suspicious methods ko safely remove kar sakte hain.
        //
        // Answer me sirf non-suspicious methods rahenge.

        vector<int> ans;

        for (int i = 0; i < n; i++) {

            if (!suspicious[i])
                ans.push_back(i);
        }

        return ans;
    }
};