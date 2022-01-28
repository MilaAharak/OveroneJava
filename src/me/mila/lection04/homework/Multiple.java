package me.mila.lection04.homework;

public class Multiple {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum = sum + a;
        }
        // System.out.println(sum);
        System.out.println(a + " * " + b + " = " + sum);
    }
}
