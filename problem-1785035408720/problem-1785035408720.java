// Last updated: 7/26/2026, 8:40:08 AM
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s==0)
4            return 0;
5        if(s>9*n)
6            return -1;
7        StringBuilder ans=new StringBuilder();
8        while(n>0){
9            if(s>=9){
10                ans.append(9);
11                s -=9;
12            }else{
13                ans.append(s);
14                s=0;
15            }
16            n--;
17        }
18        return Integer.parseInt(ans.toString());
19    }
20}