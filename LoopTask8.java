// Даны 2 числа. Определить цифры, входящие как в запись первого, так и второго числа

package by.epam.javafundamentals.basics.loops8;

import java.util.Scanner;

public class LoopTask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число x: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число y: ");
        int y = scanner.nextInt();
        int c, d;
        while ( x > 0){
            d = (x % 10);
            x = x / 10;
            c = y;
            while (c > 0) {
                if (c % 10 == d) {
                    System.out.print(d + " ");
                }
                c = c / 10;
            }
        }

    }

}
