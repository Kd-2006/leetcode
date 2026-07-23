// Last updated: 7/23/2026, 8:35:28 PM
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]> res = new ArrayList<>();
4        int n = intervals.length;
5        int i = 0;
6
7        int newStart = newInterval[0];
8        int newEnd = newInterval[1];
9        while (i < n && intervals[i][1] < newStart) {
10            res.add(intervals[i]);
11            i++;
12        }
13        while (i < n && intervals[i][0] <= newEnd) {
14            newStart = Math.min(newStart, intervals[i][0]);
15            newEnd = Math.max(newEnd, intervals[i][1]);
16            i++;
17        }
18        res.add(new int[]{newStart, newEnd});
19        while (i < n) {
20            res.add(intervals[i]);
21            i++;
22        }
23
24        return res.toArray(new int[res.size()][]);
25    }
26}