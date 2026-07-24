// Last updated: 7/24/2026, 8:02:03 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder result = new StringBuilder();
4        int count = 0;
5
6        for (int i = s.length() - 1; i >= 0; i--) {
7            char ch = s.charAt(i);
8
9            if (ch == '-') {
10                continue;
11            }
12
13            if (count == k) {
14                result.append('-');
15                count = 0;
16            }
17
18            result.append(Character.toUpperCase(ch));
19            count++;
20        }
21
22        return result.reverse().toString();
23    }
24}