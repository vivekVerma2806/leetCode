class Solution {
    public boolean isAnagram(String s, String t) {
        // vaild anagram karna hain  
        // 26 char hote hain esh ush char ko  idx aur ush ke feq match kar lo 
         if(s.length()!=t.length()) return false;

        int [] feq=new int [26];
        //feq count kar ke rakh liya hu  
        for(char ch : s.toCharArray()){
            feq[ch-'a']++;
        }
        // feq count karne ke baad se feq sub  karna hain 
        for(char ch : t.toCharArray()){
            feq[ch-'a']--;
            //neg main chala gaya to 
            if(feq[ch-'a']<0) return false;
        }

       return true;

    }
}