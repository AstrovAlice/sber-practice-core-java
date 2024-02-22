package ru.sber.base.syntax.Week2;

import java.util.Random;

public class Task8 {
    public static void main(String[] args){
        int n = 30;
        int nmax = 1000;

        Random random = new Random();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = random.nextInt(nmax + 1);
            System.out.print(a[i] + " ");
        }
        for(int i = 0; i < n - 1; i++){
            Boolean swapped = false;
            for(int j = 0; j < n - i - 1; j ++){
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
