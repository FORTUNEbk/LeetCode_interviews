package TwoPointers;

public class IsSubsequence {
    public boolean Subsequent(String s, String t){

        int pointer1 = 0;
        int pointer2 = 0;

        while(pointer1 < s.length() && pointer2 < t.length()){
            if(s.charAt(pointer1) == t.charAt(pointer2)){
                pointer1 ++;
            }
            pointer2 ++;
        }
        return pointer1 == s.length();

    }

    public static void main(String[] args) {
        IsSubsequence value = new IsSubsequence();

        String first = "abc";
        String second = "asbdcf";

        String one = "rst";
        String two = "svtsx";

        System.out.println(value.Subsequent(first, second));
        System.out.println(value.Subsequent(one, two));
    }
}
