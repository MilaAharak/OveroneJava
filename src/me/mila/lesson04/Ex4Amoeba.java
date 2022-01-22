package me.mila.lesson04;

public class Ex4Amoeba {

    public static void main(String[] args) {
        int amoebaPerThreeHours = 2;
        int hoursForTwoAmoebs = 3;
        int iterationCount = 8;
        for (int i = 1; i <= iterationCount; i++) {
            int hours = hoursForTwoAmoebs * i;
            int amoebs = i * amoebaPerThreeHours;
            System.out.println("через " + hours + "ч. получим " + amoebs + " амеб.");
        }
    }
}