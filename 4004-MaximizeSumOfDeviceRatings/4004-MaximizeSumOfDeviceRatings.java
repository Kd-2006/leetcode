// Last updated: 7/14/2026, 3:58:02 PM
import java.util.*;
class Solution {
    public long maxRatings(int[][] units) {
        int n=units.length;
        long[][] v=new long[n][2];
        int minldx=0;
        for(int i=0;i<n;i++){
            long firstMin=Long.MAX_VALUE;
            long secondMin=Long.MAX_VALUE;
            for(int rating:units[i]){
                if(rating<firstMin){
                    secondMin=firstMin;
                    firstMin=rating;
                }else if(rating<secondMin){
                    secondMin=rating;
                }
            }
            v[i][0]=firstMin;
            v[i][1]=(secondMin==Long.MAX_VALUE)?0:secondMin;
            if(v[i][0]<v[minldx][0]){
                minldx=i;
            }
        }
        long sum1=v[minldx][0];
        for(int i=0;i<n;i++){
            if(i !=minldx){
                sum1 +=Math.max(v[i][0],v[i][1]);
            }
        }
        long maxCase2=Long.MIN_VALUE;
        for(int k=0;k<n;k++){
            if(k!=minldx){
                long currentCase2=sum1+v[minldx][1]-Math.max(v[k][0],v[k][1]);
                maxCase2=Math.max(maxCase2,currentCase2);
            }
        }
        return Math.max(sum1,maxCase2);
        
    }
}