package me.mila.lesson02;

/* Пользователь вводит через консоль два числа. Найти их среднее арифметическое. */

import java.util.Scanner;

public class Ex02_1AverageCalculation {

    public static void main(String[] args) {  //метод
        Scanner in = new Scanner(System.in);  //ввод с консоли

        System.out.print("Input a: ");       //ввести a
        double a = in.nextInt();             //инициализация дробного значения a, перевод на новую строку

        System.out.print("Input b: ");       //ввести b
        double b = in.nextInt();             //инициализация дробного значения b, перевод на новую строку

        int m = 2;                           //присвоили значение m
        double c = (a + b) / m;              //вывод дробного значения с
        in.close();                          //завершение scanner
        System.out.println("Result с: " + c); //вывод результата c

    }
}

