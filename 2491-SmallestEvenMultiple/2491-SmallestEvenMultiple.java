// Last updated: 7/14/2026, 3:58:32 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        return n*2;    
    }
}