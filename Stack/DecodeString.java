import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentNum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNum = currentNum * 10 + (ch - '0');
            } else if (ch == '[') {
                stringStack.push(currentString.toString());
                numStack.push(currentNum);
                currentString = new StringBuilder();
                currentNum = 0;
            } else if (ch == ']') {
                int count = numStack.pop();
                StringBuilder temp = new StringBuilder(stringStack.pop());
                for (int i = 0; i < count; i++) {
                    temp.append(currentString);
                }
                currentString = temp;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        DecodeString decoder = new DecodeString();
        System.out.println(decoder.decodeString("3[a]2[bc]")); 
        System.out.println(decoder.decodeString("3[a2[c]]")); 
        System.out.println(decoder.decodeString("2[abc]3[cd]ef"));
    }
}