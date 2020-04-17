/** Дано действительное число R  вида nnn.ddd (3 цифровых разряда в дробной и целой частях). Поменять местами
 * дробную и целую части числа и вывести полученное значение числа*/

package by.epam.javafundamentals.basics.linear4;

import java.util.Scanner;

public class LinearTask4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите действительное число R вида nnn.ddd: ");
        String R = scanner.nextLine();
        String intPart;
        String fractPart;
        intPart = R.substring(0,3);
        fractPart = R.substring(4, 7);

        System.out.println("Полученное значение числа =" + (fractPart + "." + intPart));
    }
}