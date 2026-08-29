import java.util.*;

class Solution {

    public int[] lexicographicallySmallestArray(int[] nums, int limit) {

        int n = nums.length;

        // 1. Sorted copy
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        // 2. Value -> original indices
        Map<Integer, Queue<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i], new LinkedList<>());
            map.get(nums[i]).add(i);
        }

        int start = 0;

        // 3. Find groups in sorted array
        while (start < n) {

            int end = start;

            while (end + 1 < n &&
                   sorted[end + 1] - sorted[end] <= limit) {
                end++;
            }

            // 4. Get all original indices of this group
            List<Integer> indices = new ArrayList<>();

            for (int i = start; i <= end; i++) {
                indices.add(map.get(sorted[i]).poll());
            }

            // 5. Smallest index gets smallest value
            Collections.sort(indices);

            for (int i = start; i <= end; i++) {
                nums[indices.get(i - start)] = sorted[i];
            }

            start = end + 1;
        }

        return nums;
    }
}