package Week2;

import java.util.Random;
import Week3.Sorter;

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
        Sorter.BubbleSort(a);
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}