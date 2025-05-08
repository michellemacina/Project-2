package sandbox;

import java.util.Stack;

public class Exercise2 {
    public static void main(String[] args) {

        // prints out the given expression
        String expression = "{((a + b) * (c - d)]}";
        System.out.println("Original Expression: " + expression);

        // Check if the expression is balanced
        boolean isBalanced = isBalanced(expression);
        System.out.println("Is the expression balanced? " + isBalanced);
    }

    // method to check if it's balanced
    private static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; // Unmatched closing bracket
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false; // Unmatched closing bracket
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false; // Unmatched closing bracket
                }
            }
        }
        return stack.isEmpty(); // True if all brackets are balanced
    }
}