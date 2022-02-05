package me.mila.exam;
//Посчитать сумму четных, нечетных и всех чисел.

import java.util.Scanner;
//+
public class SumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
        int x = 0;
        int sumEven = 0;
        int sumUnEven = 0;

        while (x <= n) {
            if (x % 2 == 0) {
                sumEven += x;
            } else {
                sumUnEven += x;
            }
            x++;
        }
        System.out.println("Сумма четных чисел: " + sumEven);
        System.out.println("Сумма не четных чисел: " + sumUnEven);
        System.out.println("Общаяя сумма: " + (sumEven + sumUnEven));
    }
}


