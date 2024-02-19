package ru.sber.base.syntax;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = 0;
        do{
            n = scanner.nextInt();
            if (n < 1 || 500 < n){
                System.out.println("Введено недопустимое число " + n + ". Допустимый диапазон значений: 1-500");
                System.out.print("Введите количество чисел: ");
            }
        }while(n < 1 || 500 < n);
        for (int i = 1; n >= i; i++){
            System.out.print(i*7 + " ");
        }
    }
}
