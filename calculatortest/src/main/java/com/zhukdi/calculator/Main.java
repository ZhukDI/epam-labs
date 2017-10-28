package com.zhukdi.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.divide(3.0,0.0));
//        System.out.println(3/0);

        RPNCalculator calculator = new RPNCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Example of an expression: 45 / (9 - 4) * 8 + 15/3");
        System.out.println("Enter an expression: ");
        String string = scanner.nextLine();
        System.out.println(string);
        System.out.println(calculator.calculate(string));
    }
}
