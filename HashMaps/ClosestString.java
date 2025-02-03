import java.util.Arrays;

public class ClosestString {

    public static boolean closeStrings(String word1, String word2) {
        // Step 1: Check if both strings have the same length
        if (word1.length() != word2.length()) {
            return false;
        }
        
        // Step 2: Check if both strings have the same set of characters
        int[] count1 = new int[26]; // To count the frequency of each character in word1
        int[] count2 = new int[26]; // To count the frequency of each character in word2
        boolean[] seen1 = new boolean[26]; // To track the characters that appear in word1
        boolean[] seen2 = new boolean[26]; // To track the characters that appear in word2
        
        for (char c : word1.toCharArray()) {
            count1[c - 'a']++;
            seen1[c - 'a'] = true;
        }
        
        for (char c : word2.toCharArray()) {
            count2[c - 'a']++;
            seen2[c - 'a'] = true;
        }
        
        // Check if both strings have the same set of characters
        for (int i = 0; i < 26; i++) {
            if (seen1[i] != seen2[i]) {
                return false; // If one string has a character that the other doesn't, return false
            }
        }
        
        // Step 3: Sort the frequency arrays and compare them
        Arrays.sort(count1);
        Arrays.sort(count2);
        
        // Compare the sorted frequency arrays
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        
        // If all checks passed, the strings are close
        return true;
    }

    public static void main(String[] args) {
        String word1 = "aacabb";
        String word2 = "bbcbaa";

        System.out.println(closeStrings(word1, word2)); // Output: true
    }
}
