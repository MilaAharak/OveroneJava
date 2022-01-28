package me.mila.lesson02;

/* Пользователь вводит через консоль два числа. Найти их среднее арифметическое. */
//Delete all the comments! Code should be written in such way that we can undestand it without any additional explanations!
import java.util.Scanner;
//read about class naming. This (and further) does not look good
public class Ex02_1AverageCalculation {

    public static void main(String[] args) {  //метод
        Scanner in = new Scanner(System.in);  //ввод с консоли

        System.out.print("Input a: ");       //ввести a
        double a = in.nextInt();             //инициализация дробного значения a, перевод на новую строку

        System.out.print("Input b: ");       //ввести b
        double b = in.nextInt();             //инициализация дробного значения b, перевод на новую строку
//arithmetical mean is always division by 2, so you do not need this 'm'. However, bad naming in this case.
        int m = 2;                           //присвоили значение m
        double c = (a + b) / m;              //вывод дробного значения с
        //actually, we do not need to close Scanner in our case, there will be no resource leaks. Why did you do that?
        in.close();                          //завершение scanner
        System.out.println("Result с: " + c); //вывод результата c

    }
}

