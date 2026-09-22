class Solution {
    public int[][] merge(int[][] intervals) {

        // intervals ko sort karna hain
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        // sorted intervals ko traverse karo
        List<List<Integer>> list = new ArrayList<>();

        int n = intervals.length;

        if (n == 1) return intervals;

        int end = intervals[0][1];
        int i = 1;
        int k = 0;

        while (i != n) {

            int st_next = intervals[i][0];

            if (st_next <= end) {
                // overlap
                end = Math.max(end, intervals[i][1]);
                i++;
            } 
            else {
                // no overlap
                List<Integer> pair = new ArrayList<>();

                pair.add(intervals[k][0]);
                pair.add(end);

                list.add(pair);

                k = i;
                end = intervals[i][1];

                i++;
            }
        }

        // last interval add karo
        List<Integer> pair = new ArrayList<>();
        pair.add(intervals[k][0]);
        pair.add(end);
        list.add(pair);

        int size = list.size();

        int[][] ans = new int[size][2];

        for (int j = 0; j < size; j++) {

            int st = list.get(j).get(0);
            int ed = list.get(j).get(1);

            ans[j][0] = st;
            ans[j][1] = ed;
        }

        return ans;
    }
}