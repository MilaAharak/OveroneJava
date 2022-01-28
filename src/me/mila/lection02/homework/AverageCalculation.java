package me.mila.lection02.homework;

import java.util.Scanner;

public class AverageCalculation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = in.nextInt();

        System.out.print("Input b: ");
        double b = in.nextInt();
        double c = (a + b) / 2;

        System.out.println("Result с: " + c);
    }
}

