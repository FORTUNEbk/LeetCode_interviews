public class ReverseWordInString {
    public String reverseWords(String s) {

        s = s.trim().replaceAll("\\s+", " ");

        String[] myStr = s.split(" ");
        StringBuilder mysBuilder = new StringBuilder();

        for(int i=myStr.length -1; i >=0; i--){
            mysBuilder.append(myStr[i]);

            if(i != 0){
                mysBuilder.append(" ");
            }

        }
        return mysBuilder.toString().trim();

    }
    public static void main(String[] args) {
        ReverseWordInString myReversal = new ReverseWordInString();
        
    String myString = "Hello their, my name is Fortune";
    String result = myReversal.reverseWords(myString);
    System.out.println(result);
    }
}