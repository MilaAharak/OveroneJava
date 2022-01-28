package me.mila.lection02.homework;

import java.util.Scanner;
//ok
public class FunctionCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = in.nextDouble();

        System.out.print("Input y: ");
        double y = in.nextDouble();

        int a = 4;
        int b = 2;
        double z = a * x + b * y;

        System.out.println("Result z: " + z);
    }
}

