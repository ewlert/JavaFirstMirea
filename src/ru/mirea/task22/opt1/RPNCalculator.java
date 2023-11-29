package ru.mirea.task22.opt1;

import java.util.Stack;

class RPNCalculator {
    public static double calculate(String[] tokens) {
        Stack<Double> stack = new Stack<>();
        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(token.charAt(0), operand1, operand2);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static double performOperation(char operator, double operand1, double operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
        }
        throw new IllegalArgumentException("Invalid operator: " + operator);
    }

    public static void main(String[] args) {
        String[] tokens = {"4", "2", "+", "3", "-"};
        double result = calculate(tokens);
        System.out.println("Result: " + result);
    }
}