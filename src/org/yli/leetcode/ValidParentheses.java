package org.yli.leetcode;

import java.util.Stack;

/**
 * Created by yli on 3/17/2015.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }

                Character top = stack.peek();
                switch (c) {
                    case '}':
                        if (top != '{') return false;
                        break;
                    case ']':
                        if (top != '[') return false;
                        break;
                    case ')':
                        if (top != '(') return false;
                        break;
                }
                stack.pop();
            }
        }

        return stack.empty();
    }
}
