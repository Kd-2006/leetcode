// Last updated: 7/24/2026, 8:03:50 PM
1class Solution {
2    public String smallestGoodBase(String n) {
3        long num = Long.parseLong(n);
4
5        int maxM = (int) (Math.log(num) / Math.log(2));
6
7        for (int m = maxM; m >= 1; m--) {
8            long left = 2;
9            long right = (long) Math.pow(num, 1.0 / m) + 1;
10
11            while (left <= right) {
12                long mid = left + (right - left) / 2;
13
14                long sum = 1;
15                long curr = 1;
16
17                for (int i = 1; i <= m; i++) {
18                    if (curr > num / mid) {
19                        sum = num + 1;
20                        break;
21                    }
22                    curr *= mid;
23                    sum += curr;
24
25                    if (sum > num)
26                        break;
27                }
28
29                if (sum == num)
30                    return String.valueOf(mid);
31                else if (sum < num)
32                    left = mid + 1;
33                else
34                    right = mid - 1;
35            }
36        }
37
38        return String.valueOf(num - 1);
39    }
40}