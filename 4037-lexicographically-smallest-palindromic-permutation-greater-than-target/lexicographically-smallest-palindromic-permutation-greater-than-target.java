class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Palindrome possible hai ya nahi?
        int odd = 0;
        int mid = -1;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                odd++;
                mid = i;
            }
        }

        if (odd > 1) {
            return "";
        }

        // Sirf first half ke liye counts
        for (int i = 0; i < 26; i++) {
            freq[i] /= 2;
        }

        int half = n / 2;
        char[] ans = new char[n];

        /*
         * Pehle target ke first half ko jitna possible ho
         * copy karte hain.
         */
        int pos = 0;

        while (pos < half) {
            int c = target.charAt(pos) - 'a';

            if (freq[c] == 0) {
                break;
            }

            ans[pos] = target.charAt(pos);
            freq[c]--;
            pos++;
        }

        /*
         * Case 1:
         * Target ka poora first half available hai.
         *
         * Ho sakta hai exact same palindrome target se
         * already greater ho (mainly middle/right half ki wajah se).
         */
        if (pos == half) {
            buildPalindrome(ans, half, mid);

            String candidate = new String(ans);

            if (candidate.compareTo(target) > 0) {
                return candidate;
            }
        }

        /*
         * Ab hume right side ki taraf jaana hai:
         *
         * target[pos] se strictly bada smallest character
         * choose karo.
         *
         * Agar nahi milta, piche backtrack karo.
         */
        while (pos >= 0) {

            if (pos < half) {
                int need = target.charAt(pos) - 'a';

                // target[pos] se bada smallest available char
                for (int c = need + 1; c < 26; c++) {

                    if (freq[c] > 0) {

                        ans[pos] = (char) ('a' + c);
                        freq[c]--;

                        // Baaki half ko smallest order mein bharo
                        int idx = pos + 1;

                        for (int x = 0; x < 26; x++) {
                            while (freq[x] > 0) {
                                ans[idx++] = (char) ('a' + x);
                                freq[x]--;
                            }
                        }

                        buildPalindrome(ans, half, mid);

                        return new String(ans);
                    }
                }
            }

            /*
             * Current position par koi bigger character nahi mila.
             * Isliye previous position ko change karna padega.
             */
            if (pos == 0) {
                return "";
            }

            pos--;

            // target[pos] ko wapas available karo
            int c = target.charAt(pos) - 'a';
            freq[c]++;
        }

        return "";
    }

    private void buildPalindrome(char[] ans, int half, int mid) {

        // Odd length ka middle character
        if (mid != -1) {
            ans[half] = (char) ('a' + mid);
        }

        // First half ko mirror karo
        for (int i = 0; i < half; i++) {
            ans[ans.length - 1 - i] = ans[i];
        }
    }
}