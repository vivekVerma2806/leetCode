class Solution {
   int row ;int col; boolean [][]vis;
   private void dfs(int i ,int j,char [][]grid){
      if(i<0 || i>=row || j<0 || j>=col) return;
       if(vis[i][j]) return;
       if(grid[i][j]=='0') return; 
         vis[i][j]=true;
         grid[i][j]='0';

        dfs(i+1,j,grid);
          dfs(i-1,j,grid);
          dfs(i,j+1,grid);
           dfs(i,j-1,grid);
         return ;
   }
  
    public int numIslands(char[][] grid) {
        // dfs run karo aur aur count kar ko kitne bar dfs run kiya 
          row=grid.length; col=grid[0].length; int count=0; vis=new boolean[row][col];
          for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    count++;
                }
            }
          }

          return count;
    }
}