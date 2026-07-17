// Last updated: 7/17/2026, 1:24:26 PM
1class Solution {
2    public String toHex(int num) {
3        if (num == 0) {
4            return "0";
5        }
6
7        char[] hex = {
8            '0','1','2','3','4','5','6','7',
9            '8','9','a','b','c','d','e','f'
10        };
11
12        StringBuilder sb = new StringBuilder();
13
14        while (num != 0) {
15            sb.append(hex[num & 15]);  
16            num >>>= 4;                 
17        }
18
19        return sb.reverse().toString();
20    }
21}