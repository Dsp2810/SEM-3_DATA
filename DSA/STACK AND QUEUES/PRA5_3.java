import java.util.Scanner;
import java.util.Stack;

public class PRA5_3 {

    public static void main(String[] args) {
        String s;
        Scanner dp = new Scanner(System.in);
        System.out.println("ENTER THE STRING: ");
        s1 = dp.nextLine();
        if (chechk_valid(s1)) {
            System.out.println("THIS IS VALID PARENTHISIS");
        } else {
            System.out.println("THIS IS INVALID PARENTHISIS");

        }
        // System.out.println("THIS PROGRAM IS PERFORMED BY DHAVAL S PATEL 23CS060");
    }

    public static boolean chechk_valid(String s) {
        Stack<Character> c = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                c.push(s.charAt(i));
            } else if (s.charAt(i) == ']') {
                if (c.isEmpty()) {
                    return false;
                } else if (c.peek() == '[') {
                    c.pop();
                }
            } else if (s.charAt(i) == '(') {
                if (c.isEmpty()) {
                    return false;
                } else if (c.peek() == ')') {
                    c.pop();
                }
            } else if (s.charAt(i) == '{') {
                if (c.isEmpty()) {
                    return false;
                } else if (c.peek() == '}') {
                    c.pop();
                }
            }
        }
        if (c.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}