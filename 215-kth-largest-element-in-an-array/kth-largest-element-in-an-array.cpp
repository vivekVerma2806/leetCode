class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {

        // ye optimal hain Q ke esh main insertion ka cost bach ja raha hai 
        
        priority_queue<int,vector<int>,greater<int>>minheap;

      for(int it  : nums){
        minheap.push(it);
        if(minheap.size()>k){
            minheap.pop();
        }
      }
      return minheap.top();
    }
};