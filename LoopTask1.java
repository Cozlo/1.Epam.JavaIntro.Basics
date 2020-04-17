/** Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа
* от 1 до введенного пользователем числа*/

package by.epam.javafundamentals.basics.loops1;

import java.util.Scanner;

public class LoopTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число х: ");
        int x = scanner.nextInt();
        int y = 1;
        int sum = 0;
        while (y <= x) {
            sum += y;
            y++;
        }
        System.out.println(sum);
    }
}
