class Solution {
public:

    vector<pair<int,int>>dir{
        {1,0},{-1,0},{0,1},{0,-1}
    };
    bool findSafeWalk(vector<vector<int>>& grid, int health) {

        int row=grid.size() ;int col=grid[0].size();
        queue<tuple<int,int,int>>q; vector<vector<int>>bestH(row,vector<int>(col,-1));
    
        health-=grid[0][0];
        bestH[0][0]=health;
        if(health<=0){
            return false;
        }
         q.push({0,0,health});
        while(!q.empty()){
            auto[x,y,h]=q.front();
            q.pop();
            if(x==row-1 && y==col-1){
                return true;
            }
            for(auto it : dir){
                int nx=x+it.first;
                int ny=y+it.second;
                if(nx<0 || ny<0 || nx>=row || ny >=col){
                    continue;
                }

                int newH=h-grid[nx][ny];
                if(newH<=0){
                    continue;
                }
                if(newH<=bestH[nx][ny]){
                   continue;
                }
                bestH[nx][ny]=newH;
                q.push({nx,ny,newH});
            }
        }

        return false;
    }
};