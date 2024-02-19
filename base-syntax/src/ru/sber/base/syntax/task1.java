package ru.sber.base.syntax;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
