public class ReverseWordInString {
    public String reverseWords(String s) {

        String[] myStr = s.split(" ");
        StringBuilder mysBuilder = new StringBuilder();

        for(String m:myStr){
           StringBuilder reversed = new StringBuilder(m);
           mysBuilder.append(reversed.reverse().append(" "));

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