class Solution {
      boolean [][] vis; int n,m; int st_col;

      void dfs(int i , int j , int[][] image , int color){
            if(i>=n || i<0 || j>=m || j<0 || image[i][j]!=st_col) return;
            if(vis[i][j]) return;
             vis[i][j]=true; 
             image[i][j]=color;
            dfs(i+1,j,image,color);
            dfs(i,j+1,image,color);
            dfs(i-1,j,image,color);
            dfs(i,j-1,image,color); 
      }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.n=image.length; this.m=image[0].length; 
        vis=new boolean[n][m]; st_col=image[sr][sc];
         dfs(sr,sc,image,color);
         return image;
    }
}