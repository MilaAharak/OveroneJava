package me.mila.lection08.classwork.practic;

public class SumNumbers {
    public static void main(String[] args) {
        int[] anArray = new int[3];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        int sum = 0;

        for (int i = 0; i < anArray.length; i++) {
            sum += anArray[i];
        }
            System.out.println(sum);
        }
    }

