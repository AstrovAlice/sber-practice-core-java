package ru.sber.base.syntax;
public class Task3 {
    public static void main(String[] args){
        for (int i = 1; i <= 6; i++) {
            if ((i % 2) != 0){
                System.out.println("* * * * * * * * * *");
            }else{
                System.out.println(" * * * * * * * * * ");
            }
        }
    }
}
