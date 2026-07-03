class Solution {
public:

bool isPossible(unordered_map<int, vector<pair<int,int>>> &adj,
                vector<bool> &online,
                long long k,
                long long mid) {

    priority_queue<
        pair<long long,int>,
        vector<pair<long long,int>>,
        greater<pair<long long,int>>
    > minheap;

    int n = online.size();

    vector<long long> cost(n, LLONG_MAX);

    cost[0] = 0;
    minheap.push({0, 0});

    while (!minheap.empty()) {

        auto [c, node] = minheap.top();
        minheap.pop();

        if (c > cost[node]) continue;

        for (auto [next, wt] : adj[node]) {

            // offline node use nahi kar sakte
            if (!online[next] && next != n - 1)
                continue;

            // Binary Search condition
            if (wt < mid)
                continue;

            if (c + wt < cost[next]) {

                cost[next] = c + wt;
                minheap.push({cost[next], next});
            }
        }
    }

    return cost[n - 1] <= k;
}

int findMaxPathScore(vector<vector<int>>& edges,
                     vector<bool>& online,
                     long long k) {

    unordered_map<int, vector<pair<int,int>>> adj;

    int mx = 0;

    for (auto &it : edges) {
        adj[it[0]].push_back({it[1], it[2]});
        mx = max(mx, it[2]);
    }

    long long low = 0;
    long long high = mx;
    long long ans = -1;

    while (low <= high) {

        long long mid = low + (high - low) / 2;

        if (isPossible(adj, online, k, mid)) {
            ans = mid;
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return ans;
}
};