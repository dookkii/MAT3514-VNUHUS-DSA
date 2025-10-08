package vn.io.tunaa.dsa.week4.stack.ex3__evaluate;

import java.util.Stack;

public class Solution {

    /**
     * Tính giá trị biểu thức số học có ngoặc () và các phép toán + - * /.
     * Giả định: mỗi ký tự (số, toán tử, ngoặc) được cách nhau bởi 1 dấu cách.
     * @param expression biểu thức cần tính
     * @return giá trị biểu thức
     */
    public double evaluate(String expression) {
        String[] tokens = expression.trim().split("\\s+");

        String operator;
        double num1, num2, tmp = 0;

        Stack<Double> numbers = new Stack<>();
        Stack<String> operators = new Stack<>();

        for (String token : tokens) {
            if (token.equals(")")) {
                if (operators.isEmpty()) {
                    return numbers.pop();
                }

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
            } else if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                operators.push(token);
            } else if (!token.equals("(")) {
                numbers.push(Double.parseDouble(token));
            }
        }

        return numbers.pop();
    }
}