class Solution {
    public int minimumDeletions(int[] nums) {
        
        // like mujhe aise karna hain  hoga 
        // step 1 min_idx and max_idx o(n)
        // step 2 cal min dis from 0 and n then sum  
        int min_idx=-1; int max_idx=-1; int n =nums.length;
        int min_num=Integer.MAX_VALUE ; int max_num=Integer.MIN_VALUE;
       for(int i = 0; i< n ;i++){
          if(min_num>nums[i]){
            min_num=nums[i];
            min_idx=i;
          }
          if(max_num<nums[i]){
            max_num=nums[i];
            max_idx=i;
          }
       }
       int left = Math.min(min_idx, max_idx);
int right = Math.max(min_idx, max_idx);

// 1. Dono left se
int a = right + 1;

// 2. Dono right se
int b = n - left;

// 3. Ek left se, ek right se
int c = left + 1 + n - right;

return Math.min(a, Math.min(b, c));
    }
}