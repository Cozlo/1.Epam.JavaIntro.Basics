// Вычислить значение функции на отрезке [a,b] с шагом h

package by.epam.javafundamentals.basics.loops2;

import java.util.Scanner;

public class LoopTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение а: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();
        System.out.print("Введите значение h: ");
        int h = scanner.nextInt();
        int x = a;
        int y;
        while (x < b) {
            x += h;
            if (x > 2) {
              y = x;
            } else {
                y = -x;
            }
            System.out.println("y=" + y);
        }
    }
}
