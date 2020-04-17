// вывести на экран таблицу? соответствий между символами и их численными обозначениями в памяти компьютера
// делал для ASCII

package by.epam.javafundamentals.basics.loops6;

public class LoopTask6 {
    public static void main(String[] args) {
        for (int i = 32; i < 128; i++) {
            System.out.printf("%d %c\t",  i , (char)i);
        }
    }
}