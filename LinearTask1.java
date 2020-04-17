/*
 * Найдите значение функции: z = ((a - 3) * b / 2) + c
 */
package by.epam.javafundamentals.basics.linear1;

import java.util.Scanner;

public class LinearTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите число c: ");
        double c = scanner.nextDouble();
        double z = ((a-3)*b/2)+c;
        System.out.println("z=" + z);
    }
}