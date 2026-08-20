class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        
        // (  { [  oeping ho raha hain to push otherwies pop  karo aur dekho ke ele hain ke hain 
       
       for(int i = 0 ;i < s.length() ;i++){
            char ch  = s.charAt(i);
            if(ch=='('  || ch=='{' || ch=='['){
                st.push(ch);
            }else{
                 if (st.empty()) {
                    return false;
                }
                 char veg=st.peek();
                 st.pop();
                 if(ch==')' && veg!='('){
                    return false;
                 }
                 if(ch=='}'   && veg!='{'){
                    return false;
                 }
                 if(ch==']'   && veg!='['){
                    return false;
                 }
            }
       }
       
       return st.empty();
    }
}