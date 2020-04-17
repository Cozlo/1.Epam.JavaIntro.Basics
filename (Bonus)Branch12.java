/** Даны 3 действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в
  четвертую степень - отрицательные */

package by.epam.javafundamentals.basics.bonus.branch1;

public class Branch12 {
	public static void main(String[] args) {
		double a = 5;
		double b = 3.7;
		double c = -10;
		if (a >= 0) {
			System.out.println("a^2=" + Math.pow(a, 2));
		} else {
			System.out.println("a^4=" + Math.pow(a, 4));
		}
		if (b >= 0) {
			System.out.println("b^2=" + Math.pow(b, 2));
		} else {
			System.out.println("b^4=" + Math.pow(b, 4));
		}
		if (c >= 0) {
			System.out.println("c^2=" + Math.pow(c, 2));
		} else {
			System.out.println("c^4=" + Math.pow(c, 4));
		}
	}
}
