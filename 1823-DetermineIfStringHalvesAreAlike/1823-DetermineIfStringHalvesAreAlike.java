// Last updated: 7/14/2026, 3:58:50 PM
import java.util.Set;

class Solution {
    public boolean halvesAreAlike(String s) {
        // Define a lookup set for both lowercase and uppercase vowels
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        
        int n = s.length();
        int vowelCount = 0;
        
        // Loop through the first half and second half simultaneously
        for (int i = 0; i < n / 2; i++) {
            // Check the left half element
            if (vowels.contains(s.charAt(i))) {
                vowelCount++;
            }
            // Check the right half element
            if (vowels.contains(s.charAt(i + n / 2))) {
                vowelCount--;
            }
        }
        
        // If the balance is exactly 0, both halves have the same number of vowels
        return vowelCount == 0;
    }
}