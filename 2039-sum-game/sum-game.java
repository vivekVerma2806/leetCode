class Solution {
    public boolean sumGame(String num) {

        int leftSum = 0, rightSum = 0;
        int leftQ = 0, rightQ = 0;

        int n = num.length();

        // Left half
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                leftQ++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }

        // Right half
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                rightQ++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }

        // Total ? odd hai -> Alice wins
        if ((leftQ + rightQ) % 2 != 0) {
            return true;
        }

        // Effective difference
        int diff = leftSum - rightSum
                 + ((leftQ - rightQ) / 2) * 9;

        // Agar exact balance possible hai -> Bob wins
        // Otherwise -> Alice wins
        return diff != 0;
    }
}