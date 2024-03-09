package Week2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do{
            System.out.print("Введите количество чисел: ");
            n = scanner.nextInt();
            if (n < 1 || 500 < n){
                System.out.println("Введено недопустимое число " + n + ". Допустимый диапазон значений: 1-500");
            }
        }while(n < 1 || 500 < n);
        for (int i = 1; n >= i; i++){
            System.out.print(i*7 + " ");
        }
    }
}
