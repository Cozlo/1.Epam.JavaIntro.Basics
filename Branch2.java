// Найти max{min(a,b), min(c,d)}.

package by.epam.javafundamentals.basics.branch2;

import java.util.Scanner;

public class Branch2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите c: ");
        double c = scanner.nextDouble();
        System.out.print("Введите d: ");
        double d = scanner.nextDouble();
        double min1, min2, max;
        if (a<b){
            min1 = a;
        }
        else
            min1 = b;
        if (c<d){
            min2 = c;
        }
        else
            min2 = d;
        if (min1>min2){
            System.out.println("max=" + min1);
        }
        else
            System.out.println("max=" + min2);
        }
    }