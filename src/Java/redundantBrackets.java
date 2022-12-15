package Java;

import java.util.Stack;

public class redundantBrackets {
    public static boolean checkRedundantBrackets(String expression) {
        // Your code goes here
        Stack<Character> stack = new Stack<Character>();
        int count = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // System.out.print(c);

            if (c == ')') {
                // System.out.println();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    count = count + 1;
                    stack.pop();
                    // System.out.print(stack.pop());
                }
                // System.out.println();
                // System.out.println(count);
                if (count == 0 || count == 1) {
                    return true;
                }
                stack.pop();
                count = 0;

            } else {
                stack.push(c);
            }
        }
        return false;
    }
}
