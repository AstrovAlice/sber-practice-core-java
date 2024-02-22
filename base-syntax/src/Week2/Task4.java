package Week2;
import java.util.Scanner;
public class Task4 {
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int n = scanner.nextInt();
        if (isPrime(n)){
            System.out.println("Да");
        }else{
            System.out.println("Нет");
        }
    }
}
