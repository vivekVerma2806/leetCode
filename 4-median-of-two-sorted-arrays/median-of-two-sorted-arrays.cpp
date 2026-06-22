class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {

        // Hamesha chhoti array par binary search lagayenge
        // Taaki O(log(min(n,m))) complexity mile
        if (nums1.size() > nums2.size()) {
            return findMedianSortedArrays(nums2, nums1);
        }

        // nums1 = chhoti array
        int n = nums1.size();
        int m = nums2.size();

        // Binary Search Range
        int l = 0;
        int r = n;

        while (l <= r) {

            // nums1 ka partition index
            int px = l + (r - l) / 2;

            // nums2 ka partition index
            // Dono arrays ke left side me total
            // (n+m+1)/2 elements hone chahiye
            int py = (n + m + 1) / 2 - px;

            // nums1 ke partition ke left ka last element
            int a1 = (px == 0) ? INT_MIN : nums1[px - 1];

            // nums2 ke partition ke left ka last element
            int b1 = (py == 0) ? INT_MIN : nums2[py - 1];

            // nums1 ke partition ke right ka first element
            int a2 = (px == n) ? INT_MAX : nums1[px];

            // nums2 ke partition ke right ka first element
            int b2 = (py == m) ? INT_MAX : nums2[py];

            /*
                Partition Structure

                nums1:
                [ a1 ] | [ a2 ]

                nums2:
                [ b1 ] | [ b2 ]

                Hume aisa partition chahiye jahan:

                a1 <= b2
                b1 <= a2

                Matlab left side ke sab elements
                right side ke sab elements se chhote ya equal hain.
            */
            if (a1 <= b2 && b1 <= a2) {

                // Agar total elements even hain
                if ((n + m) % 2 == 0) {

                    /*
                        Median =

                        max(left side)
                        +
                        min(right side)

                        ----------------
                                2
                    */
                    return (max(a1, b1) + min(a2, b2)) / 2.0;
                }

                // Agar total elements odd hain
                // Median left side ka largest element hoga
                return max(a1, b1);
            }

            // a1 bahut bada hai
            // Partition ko left move karo
            else if (a1 > b2) {
                r = px - 1;
            }

            // b1 bahut bada hai
            // Partition ko right move karo
            else {
                l = px + 1;
            }
        }

        // Kabhi execute nahi hona chahiye
        return -1.0;
    }
};