// Найдите сумму квадратов первых 100 чисел

package by.epam.javafundamentals.basics.loops3;

public class LoopTask3 {
    public static void main(String[] args) {
        int result = 0;
        for (int x = 1; x <= 100; x++){
            result = result + (x*x);
            System.out.println(result);
        }
    }
}
