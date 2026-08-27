class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {

            int curr = target.charAt(i) - 'a';

            // Try to keep target[i] equal
            if (freq[curr] > 0) {
                ans.append(target.charAt(i));
                freq[curr]--;
            } 
            else {
                // Find smallest character > target[i]
                int greater = -1;

                for (int c = curr + 1; c < 26; c++) {
                    if (freq[c] > 0) {
                        greater = c;
                        break;
                    }
                }

                // We can make answer greater at this position
                if (greater != -1) {
                    ans.append((char) ('a' + greater));
                    freq[greater]--;

                    // Put remaining characters in ascending order
                    for (int c = 0; c < 26; c++) {
                        while (freq[c] > 0) {
                            ans.append((char) ('a' + c));
                            freq[c]--;
                        }
                    }

                    return ans.toString();
                }

                // No greater character here.
                // Need to backtrack.
                break;
            }
        }

        /*
         * We matched target as much as possible.
         * Now backtrack and increase some previous character.
         */
        for (int i = ans.length() - 1; i >= 0; i--) {

            // Restore the character currently at position i
            int current = ans.charAt(i) - 'a';
            freq[current]++;

            // Find smallest character greater than current
            for (int c = current + 1; c < 26; c++) {

                if (freq[c] > 0) {

                    StringBuilder result =
                        new StringBuilder(ans.substring(0, i));

                    result.append((char) ('a' + c));
                    freq[c]--;

                    // Remaining characters ascending
                    for (int x = 0; x < 26; x++) {
                        while (freq[x] > 0) {
                            result.append((char) ('a' + x));
                            freq[x]--;
                        }
                    }

                    return result.toString();
                }
            }
        }

        return "";
    }
}