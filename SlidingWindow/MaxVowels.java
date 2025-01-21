package SlidingWindow;

public class MaxVowels {
    public int MaximumVowels(String s, int k){

       int currentVowels = 0;
       int maxVowels = 0;

       for(int i = 0; i < s.length(); i++){
        if(myVowels(s.charAt(i))){
            currentVowels ++;
        }

        if( i >= k && myVowels(s.charAt(i - k))){
            currentVowels --;
        }

        maxVowels = Math.max(maxVowels, currentVowels);
       }

        return maxVowels;
    }

    public boolean myVowels(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c =='i' || c == 'o' || c =='u';

    }

    public static void main(String[] args) {
        MaxVowels myMethod = new MaxVowels();
         String myString = "abciiidef";
         int k = 3;

         System.out.println(myMethod.MaximumVowels(myString, k));
    }
    
}
