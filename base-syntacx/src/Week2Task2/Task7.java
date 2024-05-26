package Week2Task2;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a = ");
        float a = scanner.nextFloat();
        System.out.print("Введите b = ");
        float b = scanner.nextFloat();
        System.out.print("Введите c = ");
        float c = scanner.nextFloat();

        float D = b*b - 4*a*c;
        if(D < 0) {
            System.out.println("Корней нет!!!!!!");
        } else if (D == 0){
            System.out.println("x = " + (-b/2*a));
        }else{
            System.out.println("x1 = " + ((-b + Math.sqrt(D))/2*a));
            System.out.println("x2 = " + ((-b - Math.sqrt(D))/2*a));
        }
    }
}
