package me.mila.lesson02;

/*Составить программу: вычисления значения функции 4x + 2y.
Значения x и y вводятся с клавиатуры пользователем.
Результат сохраняется в переменную и выводится на экран. */
import java.util.Scanner;

public class Ex02_3FunctionCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = in.nextDouble();

        System.out.print("Input y: ");
        double y = in.nextDouble();

        int a = 4;
        int b = 2;
        double z = a * x + b * y;

        in.close();
        System.out.println("Result z: " + z);
    }
}

