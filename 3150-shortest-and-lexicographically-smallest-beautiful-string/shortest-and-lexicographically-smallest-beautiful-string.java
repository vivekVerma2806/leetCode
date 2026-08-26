class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int left = 0;
        ArrayList<String> p_ans = new ArrayList<>();
        int count_ones = 0;

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == '1') {
                count_ones++;
            }

            while (count_ones == k) {

                p_ans.add(s.substring(left, right + 1));

                if (s.charAt(left) == '1') {
                    count_ones--;
                }

                left++;
            }
        }

        if (p_ans.size() == 0) {
            return "";
        }

        p_ans.sort((a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });

        return p_ans.get(0);
    }
}