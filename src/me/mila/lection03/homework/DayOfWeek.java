package me.mila.lection03.homework;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = in.nextInt();

        if (a > 7 || a < 1) {
            System.err.println("There is no such a day of week!");
        }
        else if (a == 1){
            System.out.println("Monday");
        }
        else if (a == 2){
            System.out.println("Tuesday");
        }
        else if (a == 3){
            System.out.println("Wednesday");
        }
        else if (a == 4){
            System.out.println("Thursday");
        }
        else if (a == 5){
            System.out.println("Friday");
        }
        else if (a == 6){
            System.out.println("Saturday");
        }
        else if (a == 7){
            System.out.println("Sunday");
        }
    }
}