package me.mila.lection08.classwork.practice;
//Есть массив чисел. Пользователь вводит число. Определить, есть ли это число в массиве. Решить используя while.

import java.util.Scanner;

public class NumberOfArrayFinder {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = reader.nextInt();

        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите значение массива: ");
            arr[i] = reader.nextDouble();
        }
        System.out.print("Введите любое число: ");
        double num = reader.nextDouble();

        int i = 0;
        boolean found = false;
        while (!found && i < arr.length) {
            double elem = arr[i++];
            if (num == elem) {
                found = true;
            }
        }
        System.out.printf("Число %sнайдено в массиве.%n", found ? "" : "не ");
    }

}




