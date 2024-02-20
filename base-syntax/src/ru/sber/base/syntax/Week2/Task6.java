package ru.sber.base.syntax.Week2;

import java.util.Random;

public class Task6 {
    public static void main(String[] args){
        Random random = new Random();
        int nmax = 1000;
        int[] a = new int[nmax];

        for(int i = 0; i < nmax; i++){
            a[i] = random.nextInt(nmax + 1);
        }
        int aMax = 0;
        int aMaxI = 0;
        int sum = 0;
        for(int i = 0; i < nmax; i++){
            sum = sum + a[i];
            if (a[i] >= aMax){
                aMax = a[i];
                aMaxI = i;
            }
        }
        int aAverage = sum/nmax;
        System.out.println("Максимальное значение = [" + aMax +"] находится в элементе под индексом " + aMaxI);
        System.out.print("Среднее значение = " + aAverage);
    }
}