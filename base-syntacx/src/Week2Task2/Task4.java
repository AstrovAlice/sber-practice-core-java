package Week2Task2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, а я определю, простое ли оно: ");
        int num = scanner.nextInt();

       for(int i = 2; i <= num/2; i++) {
           temp = num % i;
           if(temp == 0){
               isPrime = false;
               break;
           }

       }
        System.out.println(isPrime ? "Да" : "Нет");

    }
}
