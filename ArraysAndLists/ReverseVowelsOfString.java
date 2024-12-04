public class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        String Vowels = "aeiouAEIOU";

        char[]  MyString =s.toCharArray();

        int left = 0;
        int right = MyString.length-1;

        while(left<right){
            while(left < right && Vowels.indexOf(MyString[left]) == -1){
                left++;
            }

            while(left < right && Vowels.indexOf(MyString[right]) ==-1){
                right--;
            }

            char temp =MyString[left];
            MyString[left] = MyString[right];
            MyString[right] = temp;

            left++;
            right--;
        }
        return new String(MyString);
        
    }

    public static void main(String[] args) {
        ReverseVowelsOfString newVowel = new ReverseVowelsOfString();
        String myString = "Fortune";
        String myString2 = "Hello";
        System.out.println(newVowel.reverseVowels(myString));
        System.out.println(newVowel.reverseVowels(myString2));
    }
}
