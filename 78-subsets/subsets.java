class Solution {
    int n;
    void solve(List<List<Integer>>ans,int []nums,List<Integer>subset,int idx){
        if(idx==n) {
            ans.add(new ArrayList<>(subset));
            return ;
        }

        // take
        subset.add(nums[idx]);
         solve(ans,nums,subset,idx+1);
        // skip 
        subset.remove(subset.size()-1);
           solve(ans,nums,subset,idx+1); 
    }
    public List<List<Integer>> subsets(int[] nums) {
        n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>subset=new ArrayList<>();
        solve(ans,nums,subset,0);
         return ans;
    }
}