package me.mila.lesson02;

/* Пользователь вводит два целых числа, строку и одно дробное число.
 Вывести на экран строку, и сумму двух целых и дробного чисел.*/

import java.util.Scanner;

public class Ex02_4OutputStringAndSumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Write string: ");
        String str = in.nextLine();

        System.out.print("Input a: ");
        int a = in.nextInt();

        System.out.print("Input b: ");
        int b = in.nextInt();

        System.out.print("Input c: ");
        double c = in.nextDouble();

        double z = a + b + c;

        in.close();
        System.out.println("Строка str: " + str);
        System.out.println("Сумма двух чисел z: " + z);
    }
}


