class Solution {
     int n;
      void swap(int []nums,int i ,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    
      }
     void solve(int[] nums , List<List<Integer>>ans,int idx){
        if(idx==n) {
            List<Integer>val=new ArrayList<>();
            for(int x : nums){
                 val.add(x);
            }
            ans.add(val);
            return;
        }
        for(int i=idx; i<n ;i++){
            swap(nums,i,idx);
            solve(nums,ans,idx+1);
            swap(nums,i,idx);
        }
     }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
         this.n=nums.length;
         solve(nums,ans,0);
        return ans;
    }
}