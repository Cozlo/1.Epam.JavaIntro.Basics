// Вычислить значение функции

package by.epam.javafundamentals.basics.branch5;

import java.util.Scanner;

public class Branch5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        double f;
        if (x <= 3) {
            f = (Math.pow(x, 2) - (3 * x) + 9);
        } else
            f = (1 / (Math.pow(x, 3) + 6));
        System.out.println("F(x)=" + f);
    }
}