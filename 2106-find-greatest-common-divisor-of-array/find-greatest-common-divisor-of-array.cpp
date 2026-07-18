class Solution {
public:
    int findGCD(vector<int>& nums) {

        int minN=*min_element(nums.begin(),nums.end());
        int maxN=*max_element(nums.begin(),nums.end());
        return gcd(minN,maxN);
    }
};