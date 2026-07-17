// Last updated: 7/17/2026, 1:21:46 PM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        long left = 1, right = num;
4
5        while (left <= right) {
6            long mid = left + (right - left) / 2;
7            long square = mid * mid;
8
9            if (square == num) {
10                return true;
11            } else if (square < num) {
12                left = mid + 1;
13            } else {
14                right = mid - 1;
15            }
16        }
17
18        return false;
19    }
20}