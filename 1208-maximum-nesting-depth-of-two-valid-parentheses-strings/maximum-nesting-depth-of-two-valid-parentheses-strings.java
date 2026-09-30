class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        // 
        List<Integer>arr=new ArrayList<>();
        int dep=0;
        for(char ch : seq.toCharArray()){
            if(ch=='(') dep++;
            int val=dep%2;
            arr.add(val);
            if(ch==')') dep--;
        }
         int n=arr.size();
        int []ans=new int[n];
         for(int i=0; i< n ;i++){
            ans[i]=arr.get(i);
         }
        return ans;
    }
}