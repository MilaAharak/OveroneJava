package me.mila.lection08.classwork.practic;

import java.util.Scanner;

public class ScannerNumbers {
    public static void main(String[] args) {
        int[] anArray = new int[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = scanner.nextInt();
        int[] anArrey = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение массива ");
            anArrey[i] = scanner.nextInt();
        }
        int j = 0;
        while (j < size) {
            System.out.println(anArrey[j]);
            j++;
        }
    }
}