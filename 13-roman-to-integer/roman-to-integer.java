class Solution {
    
    int value(char ch){
        if(ch=='I') return 1;
        if(ch=='V') return 5;
        if(ch=='X') return 10;
        if(ch=='L') return 50;
        if(ch=='C') return 100;
        if(ch=='D') return 500;
        return 1000;
    }

    public int romanToInt(String s) {

        int n=s.length();
        int ans=0;
        for(int i=0; i< n; i++){
            char ch =s.charAt(i);
            int val=value(ch);
            if(i==n-1){
                ans+=val;
            }else{
                char nch=s.charAt(i+1);
                int nextVal=value(nch);
                if(val<nextVal){
                    ans-=val;
                }else{
                    ans+=val;
                }
                
            }
        }
        return ans;
    }
}