package SlidingWindow;

public class MaxVowels {
    public int MaximumVowels(String s, int k){

        char []str = s.toCharArray();
        int count = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i] == 'a' || str[i] =='e' || str[i] == 'i'|| str[i] == 'o'|| str[i] == 'u'){
                count ++;

            }
        }

        return count;
    }

    public static void main(String[] args) {
        MaxVowels myMethod = new MaxVowels();
         String myString = "Yellow";
         int k = 3;

         System.out.println(myMethod.MaximumVowels(myString, k));
    }
    
}
