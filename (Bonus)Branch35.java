// Вычислить число и месяц в невисокосном году по номеру дня.
package by.epam.javafundamentals.basics.bonus.branch1;

import java.util.Scanner;

public class Branch35 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the day number from 1 to 365: ");
		int numberDay = scanner.nextInt();
		while (numberDay > 0) {
			if (numberDay >= 1 && numberDay <= 31) {
				System.out.println(numberDay + " of January");
				break;
			} else {
				numberDay = numberDay - 31;
			}
			if (numberDay >= 1 && numberDay <= 28) {
				System.out.println(numberDay + " of February");
				break;
			} else {
				numberDay = numberDay - 28;
			}
			if (numberDay >= 1 && numberDay <= 31) {
				System.out.println(numberDay + " of March");
				break;
			} else {
				numberDay = numberDay - 31;
			}
			if (numberDay >= 1 && numberDay <= 30) {
				System.out.println(numberDay + " of April");
				break;
			} else {
				numberDay = numberDay - 30;
			}
			if (numberDay >= 1 && numberDay <= 31) {
				System.out.println(numberDay + " of May");
				break;
			} else {
				numberDay = numberDay - 31;
			}
			if (numberDay >= 1 && numberDay <= 30) {
				System.out.println(numberDay + " of June");
				break;
			} else {
				numberDay = numberDay - 30;
			}
			if (numberDay >= 1 && numberDay <= 31) {
				System.out.println(numberDay + " of July");
				break;
			} else {
				numberDay = numberDay - 31;
			}
			if (numberDay >= 1 && numberDay <= 31) {
				System.out.println(numberDay + " of August");
				break;
			} else {
				numberDay = numberDay - 31;
			}
			if (numberDay >= 1 && numberDay <= 30) {
				System.out.println(numberDay + " of September");
				break;
			} else {
				numberDay = numberDay - 30;
			}
			if (numberDay >= 1 && numberDay <= 31) {
				System.out.println(numberDay + " of October");
				break;
			} else {
				numberDay = numberDay - 31;
			}
			if (numberDay >= 1 && numberDay <= 30) {
				System.out.println(numberDay + " of November");
				break;
			} else {
				numberDay = numberDay - 30;
			}
			if (numberDay >= 1 && numberDay <= 31) {
				System.out.println(numberDay + " of December");
				break;
			} else {
				numberDay = numberDay - 31;

			}

		}
	}
}
