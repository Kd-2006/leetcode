// Last updated: 7/22/2026, 9:57:14 PM
1class Solution {
2    int m,n;
3    int[][] dp,matrix;
4
5    public int longestIncreasingPath(int[][] matrix) {
6        int max=0;
7        n=matrix[0].length;
8        m=matrix.length;
9        this.matrix=matrix;
10        dp = new int[m][n];
11        for(int[] row : dp){
12            Arrays.fill(row, -1);
13        }
14        for(int i=0; i<m; i++){
15            for(int j=0; j<n; j++){
16                dp[i][j]=helper(i,j);
17                max=Math.max(dp[i][j],max);
18            }
19        }
20        return max+1;
21    }
22    int helper(int i, int j){
23        if(dp[i][j]!=-1){
24            return dp[i][j];
25        }
26        int max=0;
27        int val=matrix[i][j];
28        if(i+1<m && matrix[i+1][j]>val){
29            max=helper(i+1,j)+1;
30        }
31        if(j+1<n && matrix[i][j+1]>val){
32            max=Math.max(helper(i,j+1)+1,max);
33        }
34        if(j>0 && matrix[i][j-1]>val){
35           max= Math.max(helper(i,j-1)+1,max);
36        }
37        if(i>0 &&matrix[i-1][j]>val){
38            max=Math.max(helper(i-1,j)+1,max);
39        }
40        return dp[i][j]=max;
41    }
42}