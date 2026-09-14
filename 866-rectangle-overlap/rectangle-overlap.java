class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
      boolean x=rec1[0]<rec2[2] && rec2[0] <rec1[2];
      boolean y=rec1[1]<rec2[3] && rec2[1] <rec1[3];
      //[-6,-10,9,2] [0,5,4,8]
      // rec1 ka left rec2 ka right se se chota 
      return x&&y;
    }
}