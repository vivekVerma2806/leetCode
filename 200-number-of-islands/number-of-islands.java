class Solution {
   boolean [][]vis;  int n , m;
   private void  dfs (char [][] grid,int i,int j){
        if(i<0 || i>=n) return;
        if(j<0 || j>=m)  return;
        if(grid[i][j]=='0') return;
         if(vis[i][j]==true) return;
           vis[i][j]=true;

          // standar code kaise hota hain  like node par jaao aur ush ke adj niklao  aur then ush ke doe p
          dfs(grid,i+1,j);//up
          dfs(grid,i-1,j); // down
          dfs(grid,i,j+1);// right
          dfs(grid,i,j-1);// left
      return;
   }

    public int numIslands(char[][] grid) {
          n=grid.length;  m=grid[0].length;
          vis=new boolean[n][m];  int count=0;

        for(int i=0 ;i< n ; i++){
            for(int j=0; j< m; j++){
                if(grid[i][j]=='1' && vis[i][j]!=true){
                   
                        dfs(grid,i,j);
                        count++;
                
                }
            }
        }
        return count;
    }
}