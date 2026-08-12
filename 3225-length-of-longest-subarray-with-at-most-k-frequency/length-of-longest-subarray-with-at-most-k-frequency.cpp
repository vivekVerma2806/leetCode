class Solution {
public:
    int maxSubarrayLength(vector<int>& nums, int k) {
        //An array is called good if the frequency of each element in this array is less than or equal to k
        // mujhe logest subArray find out karna  hain jesh ke aandar ke sare ele ke feq k  ayr ush se choti ho 

        // how to incress the window size 
        // aur how to count ke koi number window mai kitne bar aaya hain 
        // if window main koi ele k se jade bar aajiye to left size se kam karo jab tab  wah ele ke feq <=k n ho jaiye then vaalid rahe ga to answer ko max karo widow ke size ke accoidng then phir se right size se incress karo aur count mintan karo 
        // Q ?  count kaise main tain kare ga aga  to yaha par hash map ke use hoga jo count ko maintain kare ga 

        unordered_map<int,int>feq;
        int left=0;
        int ans=0;

        for(int right =0 ; right< nums.size() ; right++){
            // ele add karo 
            feq[nums[right]]++;
            
            // check karo vaild hain ke nhi aga rnhi hain to left ko ++ karo 
            while(feq[nums[right]]>k){
              feq[nums[left]]--;
              left++;
            }
             // ab valid window ban gaya ab ans ko max karo 

         ans=max(ans,(right-left+1));
        }
        
        return ans;
    }
};