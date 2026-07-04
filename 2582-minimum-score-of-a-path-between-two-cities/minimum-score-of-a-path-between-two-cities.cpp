class Solution {
public:
    int minScore(int n, vector<vector<int>>& roads) {
        unordered_map<int,vector<pair<int,int>>>adj;
        for(auto it : roads){
            int u =it[0];
            int v=it[1];
            int cost=it[2];
            adj[u].push_back({v,cost});
            adj[v].push_back({u,cost});
          
        }
          
       // bfs use karna hain ab esh graph main aur start1 rahe ga 
       vector<bool>vis(n+1,false);
       queue<int>q;
       q.push(1);  int ans =INT_MAX;
       while(!q.empty()){
            int it = q.front();
            q.pop();
            for(auto it : adj[it]){
                auto [node ,wt]=it;
                ans=min(wt,ans);
                if(!vis[node]){
                        q.push(node);
                        vis[node]=true;
                }
            }
       }

       


    return ans;


    } 
};