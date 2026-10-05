class Solution {
    public int maxArea(int[] height) {
        /// left to right 
        int n=height.length;
        if(n<2) return 0;
        int left=0; int right=n-1;
        int ans=0;
        while(left<right){
            int width=right-left;
            int currCap=width*Math.min(height[left],height[right]);
            ans=Math.max(currCap,ans);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return ans;

    }

}