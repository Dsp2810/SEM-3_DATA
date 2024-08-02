import java.util.Scanner;
import java.util.Stack;

public class PRA5_3b {

    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);
        System.out.println("Enter Infix expression:");
        String s = dp.nextLine();
        infixtopostfix.infixToPostfix(s);
    }
}

class infixtopostfix {
    public static int Precedence(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return -1;
        }
    }
    static char associativity(char ch) {
        if (ch == '^') {
            return 'R'; 
        }
        return 'L'; 
    }
    static void infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); 
            } else {
                while (!stack.isEmpty() && (Precedence(c) < Precedence(stack.peek()) ||
                        (Precedence(c) == Precedence(stack.peek()) && associativity(c) == 'L'))) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        System.out.println("Converted into Postfix expression: " + result.toString());
    }
}
