package vn.io.tunaa.dsa.week4.stack.ex2__is_valid_expression;

import java.util.Stack;

public class Expression {
    public boolean isValidExpr(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char character : expr.toCharArray()) {
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else if (character == ')' || character == ']' || character == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char previousCharacter = stack.pop();
                if (
                        (previousCharacter != '(' && character == ')') ||
                        (previousCharacter != '[' && character == ']') ||
                        (previousCharacter != '{' && character == '}')
                ) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}