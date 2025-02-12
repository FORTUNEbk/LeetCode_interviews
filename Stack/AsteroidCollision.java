import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                int top = stack.pop();
                if (top > -asteroid) {

                    asteroid = top;
                } else if (top == -asteroid) {

                    asteroid = 0;
                }
            }

            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        // Convert the stack to an array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        AsteroidCollision solution = new AsteroidCollision();

        int[] asteroids1 = {5, 10, -5};
        int[] result1 = solution.asteroidCollision(asteroids1);
        System.out.println(java.util.Arrays.toString(result1)); 

        int[] asteroids2 = {8, -8};
        int[] result2 = solution.asteroidCollision(asteroids2);
        System.out.println(java.util.Arrays.toString(result2));

        int[] asteroids3 = {10, 2, -5};
        int[] result3 = solution.asteroidCollision(asteroids3);
        System.out.println(java.util.Arrays.toString(result3)); 
    }
}