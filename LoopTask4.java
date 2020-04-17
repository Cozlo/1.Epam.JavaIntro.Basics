// Составить программу нахождения произведения квадратов первых 200 чисел

package by.epam.javafundamentals.basics.loops4;

import java.math.BigInteger;

public class LoopTask4 {

    public static void main(String[] args) {
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 2; i <= 200; i++) {
            result = result.multiply(BigInteger.valueOf(i * i));
        }

        System.out.println(result);

    }
}

