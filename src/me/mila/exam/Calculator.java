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
            double answer;
            int operation;
            double x = 0;

            Scanner reader = new Scanner(System.in);
            System.out.println("Input two numbers: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();
            System.out.println("Input operation (+, -, *, /): ");
            operation = reader.next().charAt(0);
            switch (operation) {
                case '+':
                    answer = num1 + num2;
                    break;
                case '-':
                    answer = num1 - num2;
                    break;
                case '*':
                    answer = num1 * num2;
                    break;
                case '/':
                    answer = num1 / num2;
                    break;
                default:
                    System.out.println("Error! Input correct operation");
                    return;
            }
            System.out.println("Answer:" + answer);
            System.out.println("Would you like to continue? yes or no");
            String prover = scanner.next();
            if (prover.equals("yes"))
                yesOrNo = true;
            if (prover.equals("no"))
                yesOrNo = false;
        }
        while (yesOrNo == true);
    }
}




