class Solution {
    public int maxDepth(String s) {
        // (  ye aaya hain to count 1 
        int count=0;  int ans=0;
        for(char ch : s.toCharArray()){
                  if(ch=='('){
                    count++;
                  ans=  Math.max(ans,count);
                  }
                  if(ch==')'){
                    count--;
                  }
        }

        return ans;
    }
}