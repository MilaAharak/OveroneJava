package me.mila.exam;
//Реализуйте калькулятор с возможностью постоянного ввода числа («Хотите продолжить?»)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean yesOrNo = true;
        do {
            double num1;
            double num2;
            int operation;
            double x = 0;

            Scanner reader = new Scanner(System.in);
            System.out.println("Input two numbers: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();
            System.out.println("Input operation (+, -, *, /): ");
            operation = reader.next().charAt(0);

            String message;
            switch (operation) {
                case '+':
                    message = "Answer:" + (num1 + num2);
                    break;
                case '-':
                    message = "Answer:" + (num1 - num2);
                    break;
                case '*':
                    message = "Answer:" + (num1 * num2);
                    break;
                case '/':
                    message = num2 == 0 ? "Division by zero!" : "Answer:" + (num1 / num2);
                    break;
                default:
                    message = "Error! Input correct operation";
            }
            System.out.println(message);
            System.out.println("Would you like to continue? yes or no");
            String prover = scanner.next();
            if ("yes".equalsIgnoreCase(prover)) {
                yesOrNo = true;
            } else if ("no".equalsIgnoreCase(prover)) {
                yesOrNo = false;
            }
        }

        while (yesOrNo);
    }
}




