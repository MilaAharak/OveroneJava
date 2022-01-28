package me.mila.lection03.homework;

import java.util.Scanner;

public class ResultOfDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = in.nextDouble();

        System.out.print("Input b: ");
        double b = in.nextDouble();
        if (b != 0) {
            double c = a / b;
            System.out.println("result : " + c);
        } else {
            System.out.println("division by zero is not permitted");
        }
    }
}


