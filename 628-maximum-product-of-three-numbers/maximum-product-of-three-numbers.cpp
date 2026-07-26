class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        int n =nums.size();
        sort(nums.begin(),nums.end());
        
         if(nums[0]<0 && nums[1]<0 && nums[n-1]>=0){
            // yaha 2 case bane gaya 
            // case 1 
            int case1=nums[0]*nums[1]*nums[n-1];

            // case2 
            int case2= nums[n-1]*nums[n-2]*nums[n-3];
            return max(case1,case2);
        }else{
            return nums[n-1]*nums[n-2]*nums[n-3];
        }
    }
};