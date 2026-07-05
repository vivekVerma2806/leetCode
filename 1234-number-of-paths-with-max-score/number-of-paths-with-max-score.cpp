class Solution {
public:
    int mod = 1e9 + 7;

    vector<pair<int,int>> dir = {
        {-1,0},
        {0,-1},
        {-1,-1}
    };

    vector<vector<pair<int,int>>> dp;
    vector<string> board;
    int n;

    // Returns {maxScore, ways}
    pair<int,int> dfs(int row, int col)
    {
        // Out of bounds
        if(row < 0 || col < 0)
            return {-1,0};

        // Obstacle
        if(board[row][col] == 'X')
            return {-1,0};

        // Base case
        if(row == 0 && col == 0)
            return {0,1};

        // Memoization
        if(dp[row][col].first != -2)
            return dp[row][col];

        int best = -1;
        int ways = 0;

        for(auto d : dir)
        {
            int nr = row + d.first;
            int nc = col + d.second;

            auto child = dfs(nr,nc);

            if(child.first == -1)
                continue;

            if(child.first > best)
            {
                best = child.first;
                ways = child.second;
            }
            else if(child.first == best)
            {
                ways = (ways + child.second) % mod;
            }
        }

        if(best == -1)
            return dp[row][col] = {-1,0};

        int value = 0;

        if(board[row][col] != 'S' && board[row][col] != 'E')
            value = board[row][col] - '0';

        return dp[row][col] = {best + value, ways};
    }

    vector<int> pathsWithMaxScore(vector<string>& b)
    {
        board = b;
        n = board.size();

        dp.assign(n, vector<pair<int,int>>(n, {-2,-2}));

        auto ans = dfs(n-1,n-1);

        if(ans.first == -1)
            return {0,0};

        return {ans.first, ans.second};
    }
};