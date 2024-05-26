package Week2Task2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        if(n <= 2 || n >= 100){
            System.out.print("Введено недопустимое число " + n + ". Допустимый диапазон значений: 2 - 100");
        } else {
            int first = 1;
            int second = 1;

            System.out.print("Первые " + n + " чисел Фибоначчи: ");

            for (int i = 0; i < n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }

    }
}
