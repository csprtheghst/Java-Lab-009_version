import java.util.Stack;

public class StringPlayground {

    public static boolean checkBalancedBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{[(])}";
        String s3 = "([)]";
        String s4 = "((()))";

        System.out.println("Is s1 balanced? " + checkBalancedBrackets(s1));
        System.out.println("Is s2 balanced? " + checkBalancedBrackets(s2));
        System.out.println("Is s3 balanced? " + checkBalancedBrackets(s3));
        System.out.println("Is s4 balanced? " + checkBalancedBrackets(s4));
    }
}
