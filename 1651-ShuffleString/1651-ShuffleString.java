// Last updated: 7/14/2026, 3:59:05 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        
        return new String(result);
    }
}