package Week2;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        char randChar = (char) (random.nextInt(26) + 'A');

        System.out.println("Загадана буква от A до Z.");
        System.out.println("Попробуйте её угадать.");

        char ch;
        do {
            System.out.print("Вариант ответа: ");
            ch = Character.toUpperCase(scanner.next().charAt(0));

            while (ch < 'A' || ch > 'Z') {
                System.out.println("Введите букву от A до Z!");
                System.out.print("Вариант ответа: ");
                ch = Character.toUpperCase(scanner.next().charAt(0));
            }
            if (ch > randChar) {
                System.out.println("Ищи букву, которая перед ней в алфавите.");
            } else if (ch < randChar) {
                System.out.println("Ищи букву, которая после неё в алфавите.");
            }
        } while (ch != randChar);

        System.out.print("Верно!");
    }
}