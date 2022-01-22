package me.mila.intro;

import java.util.Scanner;

public class JavaOperations {

    public static void main(String[] args) {
        byte num_1 = 100;
        byte num_2 = 100;

        int sum = num_1+ num_2;
        long myLong = 100;
        long sumLong = sum + myLong;

        System.out.println(100 / 33);
        System.out.println(100.0 / 33);
        System.out.println(100 / 33.0);
        //         System.out.println(0 / 0);
        System.out.println(0 / 0.0);

        //вначале значение переменной a увеличивается на 1, а затем ее значение присваивает
        int a = 8;
        int b = ++a;// префиксный инкремент

        Scanner scanner = new Scanner(System.in);
        System.out.println();


    }


}
