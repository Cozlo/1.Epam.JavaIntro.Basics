/** Вычислить значение выражения по формуле (все переменные принимают действительные значения)*/

package by.epam.javafundamentals.basics.linear2;

import java.util.Scanner;

public class LinearTask2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите число c: ");
        double c = scanner.nextDouble();
        double result = ((b+(Math.sqrt(Math.pow(b,2)+4*a*c))/2*a))-Math.pow(a,3)*c+Math.pow(b,-2);
        System.out.println("Значение выражения="+result);
    }
}