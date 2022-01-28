package me.mila.lection03.homework;

import java.util.Scanner;

public class InputMaxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = in.nextDouble();

        System.out.print("Input b: ");
        double b = in.nextDouble();

        System.out.print("Input c: ");
        double c = in.nextDouble();

        /*double max = a; //декларируем локальную переменную и присваиваем ей значение, используя if
        if (b > a) {
            max = b;
        }
         if (c > b) {
            max = c;
        }*/
        double max = b > a ? b : a;
        max = c > b ? c : b;

        in.close();
        System.out.println("max number : " + max);
    }
}

