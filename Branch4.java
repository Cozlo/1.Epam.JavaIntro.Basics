/**Заданы размеры А и В прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич через отверстие*/

package by.epam.javafundamentals.basics.branch4;

import java.util.Scanner;

public class Branch4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите A: ");
        double A = scanner.nextDouble();
        System.out.print("Введите B: ");
        double B = scanner.nextDouble();
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите y: ");
        double y = scanner.nextDouble();
        System.out.print("Введите z: ");
        double z = scanner.nextDouble();
        if ((A>=x && B>=y) || (A>=x && B>=z) || (A>=y && B>=x) || (A>=y && B>=z) || (A>=z && B>=x) || (A>=z && B>=y)) {
            System.out.println("Кирпич проходит через отверстие");
        }
        else
            System.out.println("Кирпич не проходит через отверстие");

    }
}

