package me.mila.lection02.homework;

import java.util.Scanner;

public class OutputStringAndSumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Write string: ");
        String str = in.nextLine();

        System.out.print("Input integer a: ");
        int a = in.nextInt();

        System.out.print("Input integer b: ");
        int b = in.nextInt();

        System.out.print("Input double c: ");
        double c = in.nextDouble();

        double sum = a + b + c;

        System.out.println("Строка str: " + str);
        System.out.println("Сумма двух чисел sum: " + sum);
    }
}


