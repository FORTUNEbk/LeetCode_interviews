

class MergeStringsAlternatively {
    public String mergeAlternately(String word1, String word2) {
        char[]  char1= word1.toCharArray();
        char[] char2= word2.toCharArray();
        StringBuilder combined = new StringBuilder();

        int i=0;
        int j=0;
        while(i<char1.length || j<char2.length){
            if(i<char1.length){
                combined.append(char1[i]);
                i++;
            }

            if(j<char2.length){
                combined.append(char2[j]);
            }
            j++;

        }
       

        return  combined.toString();
    }

    
    public static void main(String[] args) {
        MergeStringsAlternatively  mergings= new MergeStringsAlternatively();
        String word1 = "Hello";
        String word2 = "Their";

        String results = mergings.mergeAlternately(word1, word2);
        System.out.println(results);

}
}
