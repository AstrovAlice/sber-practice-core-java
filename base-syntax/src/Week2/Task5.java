package Week2;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do{
            System.out.print("Введите количество чисел: ");
            n = scanner.nextInt();
            if (n <= 2 || 100 <= n){
                System.out.println("Введено недопустимое число " + n + ". Допустимый диапазон значений: 2-100");
            }
        }while(n <= 2 || 100 <= n);
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
