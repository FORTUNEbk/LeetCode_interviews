import java.util.Arrays;

public class ClosestString {

    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }
        
        int[] count1 = new int[26]; 
        int[] count2 = new int[26]; 
        boolean[] seen1 = new boolean[26]; 
        boolean[] seen2 = new boolean[26]; 
        
        for (char c : word1.toCharArray()) {
            count1[c - 'a']++;
            seen1[c - 'a'] = true;
        }
        
        for (char c : word2.toCharArray()) {
            count2[c - 'a']++;
            seen2[c - 'a'] = true;
        }
        
        for (int i = 0; i < 26; i++) {
            if (seen1[i] != seen2[i]) {
                return false; 
            }
        }
        
        Arrays.sort(count1);
        Arrays.sort(count2);
        
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String first = "aacabb";
        String second = "bbcbaa";

        System.out.println(closeStrings(first, second));
    }
}
