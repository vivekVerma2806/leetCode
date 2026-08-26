class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int left = 0;
        int count_ones = 0;
        String ans = "";

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == '1') {
                count_ones++;
            }

            while (count_ones == k) {

                String curr = s.substring(left, right + 1);

                if(ans.equals("") || curr.length()<ans.length() || (curr.length()==ans.length() && curr.compareTo(ans)<0)){
                    ans=curr;
                }


                if (s.charAt(left) == '1') {
                    count_ones--;
                }

                left++;
            }
        }

        return ans;
    }
}