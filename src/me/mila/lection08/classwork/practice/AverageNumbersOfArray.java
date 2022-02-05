package me.mila.lection08.classwork.practice;
//Есть массив чисел. Найти среднее арифметическое число элементов массива.


import java.util.Scanner;

public class AverageNumbersOfArray {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int size = scanner.nextInt();
            double[] anArr = new double[size];
            double summa = 0;
            for (int i = 0; i < size; i++) {
                System.out.println("Введите значение массива: ");
                anArr[i] = scanner.nextDouble();
                summa += anArr[i];
            }
            int j = 0;
            while (j < size) {
                System.out.println(anArr[j]);
                j++;
            }

            System.out.printf("%.2f", summa / size); //в кавычках написано сколько символов после запятой выводить
        }
    }