// Last updated: 7/14/2026, 3:57:51 PM
class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid=new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]='#';
            }
        }
        int i=0,j=0;
        grid[i][j]='.';
        while(j+1<n){
            j++;
            grid[i][j]='.';
        }
        while(i+1<m){
            i++;
            grid[i][j]='.';
        }
        String[] res=new String[m];
        for(int r=0;r<m;r++){
            res[r]=new String(grid[r]);
        }
        return res;
        
    }
}