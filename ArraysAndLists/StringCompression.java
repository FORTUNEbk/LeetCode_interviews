class StringCompression{
    public int compress(char[] chars) {
        int write = 0;  
        int read = 0;   

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            chars[write++] = currentChar;

            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                result.append(word2.charAt(j++));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        StringCompression solution = new StringCompression();

        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int length1 = solution.compress(chars1);
        System.out.println(length1); 
        System.out.println(new String(chars1, 0, length1)); 

        String word1 = "abc";
        String word2 = "pqr";
        String merged = solution.mergeAlternately(word1, word2);
        System.out.println(merged); 
    }
}
