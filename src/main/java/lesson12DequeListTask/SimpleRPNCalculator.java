package lesson12DequeListTask;

import java.util.Stack;

public class SimpleRPNCalculator {
    public static void main(String[] args) {
        // Example usage:
        String[] expression = {"2", "3", "*", "5", "+"};
        int result = evaluateRPN(expression);
        System.out.println("Result: " + result);
    }
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int op1 = stack.pop();
                int op2 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(op2 + op1);
                        break;
                    case "-":
                        stack.push(op2 - op1);
                        break;
                    case "*":
                        stack.push(op2 * op1);
                        break;
                    case "/":
                        stack.push(op2 / op1);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }

        }
        return stack.pop();
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
