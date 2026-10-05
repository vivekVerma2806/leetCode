class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n=matrix.length; int m=matrix[0].length;
        int low=0; int high=m*n-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            int col=mid%m;
            int row=mid/m;
            if(matrix[row][col]==target) return true;
            if(matrix[row][col]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return false;
    }
}