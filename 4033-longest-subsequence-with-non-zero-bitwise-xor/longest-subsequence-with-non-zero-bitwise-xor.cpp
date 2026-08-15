class Solution {
public:
    int longestSubsequence(vector<int>& nums) {
    // ehs Question main 3 hi answer possible hain
    // case1 agar sare ele ka xor !=0  hian to  nums ka length 
    // case 2 agar ele ka xor zero hain hain to aur ele sare same na ho to 
    // 1 ^1 ==0 deta hai aise hi n-1 kar denge Q ke last wala 2 hi zero banye gaye same ^ same ke sath zero
    // case 3 main  agr sare ele zero hain to 0 anser hoga 

    int xr=0;  int allEleZero=true;

      for(int x  :nums){
        xr^=x;
        if(x!=0){
            allEleZero=false;
        }
      }

       if(allEleZero){
        return 0;
       }
       if(xr!=0){
        return nums.size();
       }
        return nums.size()-1;
    }
};