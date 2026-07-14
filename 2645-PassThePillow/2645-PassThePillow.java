// Last updated: 7/14/2026, 3:58:28 PM
class Solution {
    public int passThePillow(int n, int time) {
         int t = time % (2 * (n - 1));
                 if (t <= n - 1){
            return 1 + t;
                 }
        else{
         return n - (t - (n - 1));
        }
    }
}