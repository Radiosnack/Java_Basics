package com.muskan;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(calculator(100,'-',9));
    }

    private static int calculator(int a, char op, int b) {

        int result = 0;
        return switch (op) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '/' -> result = a / b;
            case '%' -> result = a % b;
            case '*' -> result = a * b;
            default -> result;
        };

    }


}
