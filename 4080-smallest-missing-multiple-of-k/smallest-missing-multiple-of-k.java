class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        int misNum=k;
         
         HashSet<Integer>st=new HashSet<>();
         //
         for(int num : nums){
            st.add(num);
         }

         //ab number find out karo agar nhi mila to retun karo agar mil gaya to +k karo 
         
         while(st.contains(misNum)){
            misNum+=k;
         }
        

        return misNum;
    }
}