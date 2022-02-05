package me.mila.lection08.classwork.practice;
//При помощи класса сканер и пользователя заполнить массив.


import java.util.Scanner;

public class ScannerNumbers {
    public static void main(String[] args) {
        int[] anArray = new int[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = scanner.nextInt();
        int[] anArr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение массива ");
            anArr[i] = scanner.nextInt();
        }
        int j = 0;
        while (j < size) {
            System.out.println(anArr[j]);
            j++;
        }
    }
}