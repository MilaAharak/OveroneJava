package me.mila.exam;
//Посчитать сумму четных, нечетных и всех чисел.

import java.util.Scanner;
//+
public class SumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = in.nextInt();
        int x = 0;
        int sumEven = 0;
        int sumOdd = 0;

        while (x <= n) {
            if (x % 2 == 0) {
                sumEven += x;
            } else {
                sumOdd += x;
            }
            x++;
        }
        System.out.println("Сумма четных чисел: " + sumEven);
        System.out.println("Сумма нечетных чисел: " + sumOdd);
        System.out.println("Общая сумма: " + (sumEven + sumOdd));
    }
}


