/** Вычислить значение выражения по формуле (все переменные принимают действительные значения) ((sinx+cosy)/(cosx-siny))*tgxy*/

package by.epam.javafundamentals.basics.linear3;

import java.util.Scanner;

public class LinearTask3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите значение y: ");
        double y = scanner.nextDouble();
        double result = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.println("Значение выражения = "+result);
    }
}
