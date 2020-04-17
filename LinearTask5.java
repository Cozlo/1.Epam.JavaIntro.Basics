package by.epam.javafundamentals.basics.linear5;

/** Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение
 * длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSс.*/

import java.util.Scanner;

public class LinearTask5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите натуральное число T: ");
        int T = scanner.nextInt();
        int hours = T/3600;
        int min = (T%3600)/60;
        int sec = (T%3600)%60;
        System.out.println(hours + "ч " + min + "мин " + sec + "c");
    }
}
