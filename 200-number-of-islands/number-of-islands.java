class Solution {
    int count;  boolean [][] vis; int n,m; 
    void dfs(int i, int j , char [][]grid){
        if(i>=n || i<0  || j >=m || j<0 || grid[i][j]!='1') return;
        if(vis[i][j]==true) return;
       
        vis[i][j]=true; 
        dfs(i+1,j,grid);
         dfs(i,j+1,grid);
          dfs(i-1,j,grid);
           dfs(i,j-1,grid);
    }

    public int numIslands(char[][] grid) {
        this.count=0;
         n=grid.length; m=grid[0].length;
         vis = new boolean[n][m];
         for(int i=0 ;i <n ;i++){
            for(int j=0 ;  j< m; j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    dfs(i,j,grid);
                    count++;
                }
            }
         }

           return count; 
    }
}