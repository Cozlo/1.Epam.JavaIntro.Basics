/** даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид: a(n) = 1/2^n + 1/3^n */
package by.epam.javafundamentals.basics.loops5;

import java.util.Scanner;

public class LoopTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение e: ");
        double e = scanner.nextDouble();
        double sum = 0;
        for (int n = 1; ((1 / Math.pow(2, n) + (1 / Math.pow(3, n)))) >= e; n++) {
           sum += ((1 / Math.pow(2, n) + (1 / Math.pow(3, n))));
            System.out.println(sum);

        }
    }
}
