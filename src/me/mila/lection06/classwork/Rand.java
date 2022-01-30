package me.mila.lection06.classwork;
// Вводим число. Программа генерирует рандомное число.
// Определяем равно (больше, меньше) ли введенное число сгенерированному
import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        Random random = new Random();
        int randomNumber = random.nextInt();
        String text = number < randomNumber ? "меньше" : number > randomNumber ? "больше" : "равно";
        System.out.println("Рандомное число: " + randomNumber);
        System.out.println("Введённое число " + text + " чем рандомное.");
    }

}
