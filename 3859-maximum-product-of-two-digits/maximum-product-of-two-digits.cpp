class Solution {
public:
    int maxProduct(int n) {
     
                vector<int>nums;
                   while(n){
                     int d = n%10;
                     n=n/10;
                      nums.push_back(d);
                        
                   }

                   sort(nums.rbegin(),nums.rend());
          
        return nums[0]*nums[1];
    }
};