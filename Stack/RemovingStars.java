package Stack;

public class RemovingStars {
    public String removeStars(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                stack.deleteCharAt(stack.length() - 1); 
            } else {
                stack.append(c); 
            }
        }

        return stack.toString();
    }

    public static void main(String[] args) {
        RemovingStars myMethod = new RemovingStars();
        System.out.println(myMethod.removeStars("leet**cod*e")); 
        System.out.println(myMethod.removeStars("erase*****")); 
    }
}