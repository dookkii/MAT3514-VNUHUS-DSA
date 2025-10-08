package vn.io.tunaa.dsa.week4.stack.ex4__evaluate_reverse_polish_notation;

import java.util.Stack;

public class Solution {

    /**
     * Tính giá trị biểu thức số học có ngoặc () và các phép toán + - * /.
     * Giả định: mỗi ký tự (số, toán tử, ngoặc) được cách nhau bởi 1 dấu cách.
     * @param expression biểu thức cần tính
     * @return giá trị biểu thức
     */
    public int evaluateReversePolishNotation(String expression) {
        String[] tokens = expression.trim().split("\\s+");

        String operator;
        int num1, num2, tmp = 0;

        Stack<Integer> numbers = new Stack<>();
        Stack<String> operators = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                operators.push(token);

                num2 = numbers.pop();
                num1 = numbers.pop();
                operator = operators.pop();

                switch (operator) {
                    case "+":
                        tmp = num1 + num2;
                        break;
                    case "-":
                        tmp = num1 - num2;
                        break;
                    case "*":
                        tmp = num1 * num2;
                        break;
                    case "/":
                        tmp = num1 / num2;
                        break;
                }

                numbers.push(tmp);
            } else {
                numbers.push(Integer.parseInt(token));
            }
        }

        return numbers.pop();
    }
}