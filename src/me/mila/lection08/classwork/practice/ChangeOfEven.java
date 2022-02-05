package me.mila.lection08.classwork.practice;
//Есть массив чисел. Заменить каждый нечетный элемент массива на 0.


public class ChangeOfEven {
    public static void main(String[] args) {
        int[] anArray = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] % 2 != 0) {
                anArray[i] = 0;
            }
            System.out.println(anArray[i]);

        }
    }
}