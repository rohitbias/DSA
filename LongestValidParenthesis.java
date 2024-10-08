
/*Given a string containing just the characters '(' and ')', return the length of the 
longest valid (well-formed) parentheses substring

Example 1:
Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".

Example 2:
Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".

Example 3:
Input: s = ""
Output: 0 
*/
import java.util.Stack;

public class LongestValidParenthesis {
    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(maxValidParenthesis(s));
    }

    /*
     * Step 1: Track number of left bracket and number of right bracket
     * Step 2: Initialize left and right to 0
     * Step 3: When left and right counter become equals the match is found and
     * update the max=(Left *2)
     * Step 4: if right is > left, set the counter to zero as string is now invalid.
     * Step 5: Math.Max(max, left*2)
     * Step 6: Repeat step 1-5 to traverse from right to left
     */
    public static int maxValidParenthesis(String str) {
        int left = 0;
        int right = 0;
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                left++;
            else
                right++;
            if (left == right)
                max = Math.max(max, left * 2);
            else if (right > left) {
                left = 0;
                right = 0;
            }
        }
        // Need to traverse again from right to left to check if we have any left orphan
        // bracket
        left = 0;
        right = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '(')
                left++;
            else
                right++;
            if (left == right)
                max = Math.max(max, left * 2);
            else if (left > right) {
                left = 0;
                right = 0;
            }
        }
        return max;
    }

    /*
     * Approach 2: By using stack
     * We will maintain the index in the stack
     * if we have opening bracked push the element
     * if not pop the stack and check if the pop has made stack empty if yes update the index in the stack.
     */
    public static int maxValidParenthesisByStack(String str) {
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        stack.push(-1);// starting condition as a marker when we do not have any element in the stack.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(i);// insterted the value to the stack
            } else {
                stack.pop();
                if (stack.empty()) {// if the above pop has made stack empty
                    stack.push(i);
                }
                max = Math.max(max, i - stack.peek());
            }
        }
        return max;
    }
}
