// Last updated: 7/14/2026, 3:58:20 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int round=((purchaseAmount+5)/10)*10;
        return 100 - round;   
    }
}


