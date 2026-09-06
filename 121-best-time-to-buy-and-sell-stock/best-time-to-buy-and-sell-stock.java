class Solution {
    public int maxProfit(int[] nums) {
    // second  conpect kya hoga ke main  stack ka use hoga par kaise montic incress stack
    // like 7 aaya to puh 1 aya to  7 ko  pop 1 ko  puch 5 aaya to puch ans  aur jab 3 aaya to 5 pop 3 ko puch jab 6 ayaha to push  stack ke neche to base chota aur upar sabse bare 
       Deque<Integer>dq=new ArrayDeque<>();
       int ans=0;
       int n =nums.length;
       for(int i =0 ; i< n ;i++){
          
          //agr empty hain to puch on top
         if(dq.isEmpty()){ dq.addFirst(nums[i]);}
         // agar empty nhi ho to 
       
             while(!dq.isEmpty() && dq.peekFirst()>nums[i]){
                dq.removeFirst();
             }
             if(!dq.isEmpty()){
                int val=nums[i]-dq.peekLast();
                 ans=Math.max(ans,val);
             }
             dq.addFirst(nums[i]);
             
         }

       
         return ans;
    }
}