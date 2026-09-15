class Solution {
    public int firstUniqChar(String s) {
        int [][]freq=new int[26][2];// esh main 

        for(int i =0 ; i<s.length();i++){
           char ch=s.charAt(i);
             // esh main idx ka freq aur idx ka store karna hain ush idx ka 
             freq[ch-'a'][0]++;
             freq[ch-'a'][1]=i;
        } 
    // abhi sab ka count kar liye hain  aur ab ush 
    int ans=-1;
       for(int i=0; i<26;i++){
            if(freq[i][0]==1){

                if(ans==-1){
                    ans=freq[i][1];
                }else{
                    ans=Math.min(freq[i][1],ans);
                }
            }
       }
        return ans;
    }
}