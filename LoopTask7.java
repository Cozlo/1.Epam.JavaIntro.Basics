// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме 1 и самого числа. m и n ввести
// с клавиатуры

package by.epam.javafundamentals.basics.loops7;

import java.util.Scanner;

    public class LoopTask7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите меньшее число m: ");
            int m = scanner.nextInt();
            System.out.print("Введите большее число n: ");
            int n = scanner.nextInt();
            for( ;m < n; m++){
                System.out.print("\nДелители числа " + m + ": ");
                for (int i = 2; i < m; i++) {
                    if (m % i == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }