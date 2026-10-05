class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>st=new HashSet<Integer>();
        for(int x : nums){
            if(st.contains(x)) return true;
            st.add(x);
        }

        return false;
    }
}