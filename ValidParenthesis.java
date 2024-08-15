import java.util.*;

public class ValidParenthesis {
    public static void main(String args[]) {
        System.out.println(isValidParenthesis("[]]"));

    }

    public static boolean isValidParenthesis(String str) {

        Stack<Character> st = new Stack<Character>();
        if (str.length() % 2 != 0) {
            return false;
        } else {
            for (char ch : str.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    st.push(ch);
                } else if ((ch == ')' && !st.isEmpty() && st.peek() == '(')
                        || (ch == '}' && !st.isEmpty() && st.peek() == '{')
                        || (ch == ']' && !st.isEmpty() && st.peek() == '[')) {
                    st.pop();
                }
            }
            return st.empty();
        }
    }
}
