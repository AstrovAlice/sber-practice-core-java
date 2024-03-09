package Week2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        float a = scanner.nextFloat();
        System.out.print("b: ");
        float b = scanner.nextFloat();
        System.out.print("c: ");
        float c = scanner.nextFloat();
        float D = b*b - 4*a*c;
        if (D < 0){
            System.out.print("корней нет.");
        } else if (D == 0) {
            System.out.print("x = " + ((-b/2*a)));
        } else {
            System.out.print("x1 = " + ((-b + Math.sqrt(D))/2*a));
            System.out.print("x2 = " + ((-b - Math.sqrt(D))/2*a));
        }
    }
}
