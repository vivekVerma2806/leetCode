class Solution {
     int value(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        return 1000;
    }

    public int romanToInt(String s) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            int val = 0;

           val =value(ch);
            // Last character hai to simply add
            if (i == s.length() - 1) {
                ans += val;
            }
            else {
                char next = s.charAt(i + 1);

                int nextVal = 0;

              nextVal=value(next);

                if (val < nextVal) {
                    ans -= val;
                } else {
                    ans += val;
                }
            }
        }

        return ans;
    }
}