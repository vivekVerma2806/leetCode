class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n =img1.length;
        int ans=0;
        for(int rowofset=-(n-1);rowofset<=(n-1);rowofset++){
            for(int colofset=-(n-1); colofset<=(n-1); colofset++){
               int count=0;
                  for(int i =0 ; i<n; i++){
                    for(int j=0; j<n ;j++){
                        
                        int i1=i+rowofset;
                        int j1=j+colofset;
                         // value check karna hain 
                        if(i1>=0 && i1<n && j1>=0 && j1<n){
                            if(img1[i1][j1]==1 && img2[i][j]==1){
                                count++;
                            }
                        }
                        ans=Math.max(count,ans);
                    }
                  }
            } 
        }
        return ans;
    }
}