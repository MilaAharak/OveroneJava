package me.mila.lection03.homework;

/*Напишите программу, чтобы получить число от пользователя и вывести его положительное или отрицательное значение.*/

import java.util.Scanner;

public class PositiveAndNegativValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = in.nextDouble();

        String plusOrEmpty = a > 0 ? "+" : "";

        in.close();
        System.out.println("Value a: " + plusOrEmpty + a);

    }
}
