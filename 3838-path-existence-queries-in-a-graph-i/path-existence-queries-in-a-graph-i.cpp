class Solution {
public:
    vector<bool> pathExistenceQueries(int n, vector<int>& nums, int maxDiff, vector<vector<int>>& queries) {
        vector<int>comp(n);
        comp[0]=0;
        for(int i=1 ;i< n;i++){
            if(nums[i]-nums[i-1]<=maxDiff){
                comp[i]=comp[i-1];
            }else{
                comp[i]=comp[i-1]+1;
            }
        }
        vector<bool>ans;
        for(auto it : queries){
            int u=it[0] ;int v=it[1];
            int c1=comp[u]; int c2=comp[v];
            bool check =c1==c2;
            ans.push_back(check);

        }
        return ans;
    }
};