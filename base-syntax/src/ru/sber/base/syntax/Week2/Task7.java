package ru.sber.base.syntax.Week2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();

        double D = b*b - 4*a*c;
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
