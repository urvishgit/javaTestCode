//Write a program to check whether a given string has balanced parentheses?
import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter parenthesis string:");
        String input = scanner.next();

        if(balancedParenthesis(input)) {
            System.out.println("Given string balanced.");
        } else {
            System.out.println("Given string is not balanced.");
        }
    }
    public static boolean balancedParenthesis(String input) {

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case'[':
                case'(':
                case'{':
                    stack.push(input.charAt(i));
                    break;
                case']':
                    if(stack.empty() || !stack.pop().equals('[')) {
                        return false;
                    }
                    break;
                case')':
                    if(stack.empty() || !stack.pop().equals('(')) {
                        return false;
                    }
                    break;
                case'}':
                    if(stack.empty() || !stack.pop().equals('{')) {
                        return false;
                    }
                    break;
            }
        }
        return stack.empty();
    }
}
