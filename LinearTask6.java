/** для данной области составить линейную программу, которая печатает "true" если точка с координатами (х,у) принадлежит
 * закрашенной области и "false" - в противном случае */

package by.epam.javafundamentals.basics.linear6;

import java.util.Scanner;

public class LinearTask6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату х: ");
        double x = scanner.nextDouble();
        System.out.print("Введите координату у: ");
        double y = scanner.nextDouble();
        boolean result = (((y>=-3) && (y<=0) && (x>=-4) && (x<=4)) || ((y>=0) && (y<=4) && (x>=-2) && (x<=2)));
        System.out.println(result);
    }
}
