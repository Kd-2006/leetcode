// Last updated: 7/17/2026, 1:23:09 PM
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        List<String> result = new ArrayList<>();
4
5        for (int hour = 0; hour < 12; hour++) {
6            for (int minute = 0; minute < 60; minute++) {
7                if (countBits(hour) + countBits(minute) == turnedOn) {
8                    result.add(hour + ":" + String.format("%02d", minute));
9                }
10            }
11        }
12
13        return result;
14    }
15
16    private int countBits(int n) {
17        int count = 0;
18        while (n > 0) {
19            count += n & 1;
20            n >>= 1;
21        }
22        return count;
23    }
24}