package me.mila.lesson02;

/*Пользователь вводит через консоль два числа.
Сравнить: первое число больше второго?
Результат сравнения положить в переменную соотвествующего типа.
Вывести на экран результат сравнения. */


import java.util.Scanner;

public class Ex02_2NumberComparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = in.nextInt();

        System.out.print("Input b: ");
        double b = in.nextInt();
        boolean c = a > b;
        in.close();
        System.out.println("Result с: " + c);
    }
}
