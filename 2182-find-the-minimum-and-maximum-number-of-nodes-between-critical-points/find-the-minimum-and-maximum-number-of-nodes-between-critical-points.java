class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        // Answer initially [-1, -1]
        // Agar 2 se kam critical points mile,
        // to yahi return karna hai.
        int[] ans = {-1, -1};

        // 3 nodes ko ek saath compare karenge:
        // prev -> curr -> next
        ListNode prev = head;
        ListNode curr = head.next;

        // curr node ka index
        // Head ka index = 0
        int index = 1;

        // First critical point ka index
        int first = -1;

        // Last/previous critical point ka index
        int last = -1;

        // Minimum distance store karega
        int minDist = Integer.MAX_VALUE;


        // Last node critical point nahi ho sakta
        // kyunki uska next node nahi hai
        while (curr.next != null) {

            // Check karo curr critical point hai ya nahi

            // Case 1:
            // curr apne dono neighbours se bada hai
            boolean maxPoint =
                curr.val > prev.val &&
                curr.val > curr.next.val;

            // Case 2:
            // curr apne dono neighbours se chhota hai
            boolean minPoint =
                curr.val < prev.val &&
                curr.val < curr.next.val;


            // Agar curr critical point hai
            if (maxPoint || minPoint) {

                // Agar ye pehla critical point hai
                if (first == -1) {
                    first = index;
                }

                // Agar pehle se ek critical point mil chuka hai
                if (last != -1) {

                    // Current critical point aur
                    // previous critical point ke beech distance
                    int distance = index - last;

                    // Minimum distance update karo
                    minDist = Math.min(minDist, distance);
                }

                // Current point ko last critical point bana do
                last = index;
            }

            // Linked list mein ek step aage
            prev = curr;
            curr = curr.next;

            // Index bhi increase karo
            index++;
        }


        // Agar sirf 0 ya 1 critical point mila
        // to valid answer possible nahi hai
        if (first == -1 || first == last) {
            return ans;
        }


        // Maximum distance:
        // Last critical point - First critical point
        int maxDist = last - first;

        // [minimum distance, maximum distance]
        return new int[]{minDist, maxDist};
    }
}