// Last updated: 7/14/2026, 3:59:12 PM
class Solution {
    public int maxPower(String s) {
        int maxStreak = 1;
         int currentStreak = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }
            maxStreak = Math.max(maxStreak, currentStreak);
        }
        
        return maxStreak;
    }
}