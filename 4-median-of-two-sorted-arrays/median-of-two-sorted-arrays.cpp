class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        
        if(nums1.size()>nums2.size()){
            return findMedianSortedArrays(nums2,nums1);
        }
      //
      int n=nums1.size();
      int m =nums2.size();
      
      int l=0 ; int r=n;

      while(l<=r){
        int px=l +(r-l)/2;
        int py=(n+m+1)/2-px;
        int a1= (px==0 )? INT_MIN :nums1[ px-1];
        int b1= (py==0) ? INT_MIN : nums2[py-1];
        int a2= (px==n) ?INT_MAX : nums1[px];
        int b2= (py==m) ? INT_MAX : nums2[py];
        
        if(a1<=b2 && b1 <= a2 ){

            if((n+m)%2==0){
                return ((max(a1,b1)+min(a2,b2))/2.0);
            }else{
                return max(a1,b1);
            }
        }else{
            if(a1>b2){
                //a1 ko right jana honga 
                r=px-1;
            }else{
                 
                 l=px+1;
            }
        }
      }   



return -1.0;


    }
};