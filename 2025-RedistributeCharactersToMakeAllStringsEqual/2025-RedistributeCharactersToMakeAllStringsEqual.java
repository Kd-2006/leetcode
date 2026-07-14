// Last updated: 7/14/2026, 3:58:45 PM
class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        int[] charCounts = new int[26];
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                charCounts[word.charAt(i) - 'a']++;
            }
        }
        for (int count : charCounts) {
            if (count % n != 0) {
                return false;
            }
        }
        
        return true;
    }
}