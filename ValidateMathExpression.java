import java.util.Stack;

public class ValidateMathExpression {
    public static String helper(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } 
            else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return "INVALID";
                }
            }
        }

        return stack.isEmpty() ? "VALID" : "INVALID";
    }

    public static void main(String[] args) {
        String[] expressions = {"(a+b)(c+d+e)", "(a+b)(c+d)", "(a+b))", "(ab+)"};

        for (String exp : expressions) {
            System.out.println(exp + ": " + helper(exp));
        }
    }
}
