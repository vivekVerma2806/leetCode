class Solution {
    public boolean uniformArray(int[] nums1) {

        int min = nums1[0];

        // minimum number find karo
        for (int num : nums1) {
            min = Math.min(min, num);
        }

        // minimum odd hai
        if (min % 2 == 1) {
            return true;
        }

        // minimum even hai,
        // ab koi odd number hai kya?
        for (int num : nums1) {
            if (num % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}