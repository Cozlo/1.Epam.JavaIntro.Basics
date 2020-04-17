/**Даны три точки A(x1,y1), B(x2,y2), C(x3,y3). Определить, будут ли они расположены на одной прямой*/

package by.epam.javafundamentals.basics.branch3;

import java.util.Scanner;

public class Branch3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите координату y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Введите координату x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите координату y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Введите координату x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Введите координату y3: ");
        double y3 = scanner.nextDouble();
        double s = (((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3))/2); // s-площадь треугольника образованного точками A, B, C. Если s=0,
        // значит точки лежат на одной прямой, иначе - не лежат
        if (s == 0){
            System.out.println("Точки лежат на одной прямой");
        }
        else
            System.out.println("Точки не лежат на одной прямой");

    }
}
