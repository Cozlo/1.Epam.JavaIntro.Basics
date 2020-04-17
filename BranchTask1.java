/** Даны 2 угла треугольника (в градусах). Определить, существует ли такой треугольник, и если дда, то будет ли он
 * прямоугольным*/

package by.epam.javafundamentals.basics.branch1;

import java.util.Scanner;

public class BranchTask1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите угол x в градусах: ");
        int x = scanner.nextInt();
        System.out.print("Введите угол y в градусах: ");
        int y = scanner.nextInt();
        int summAngles = x + y;
        if (summAngles < 180 && x > 0 && y > 0){
            if ( x != 90 && y != 90 && (180 - summAngles) != 90)
                System.out.println("Треугольник существует, он не прямоугольный");
            else
                System.out.println("Треугольник существует, он прямоугольный");
        }
        else
            System.out.println("Треугольник не существует");

    }
}
