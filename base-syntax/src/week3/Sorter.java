package week3;

public class Sorter {
    public static int[] BubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            Boolean swapped = false;
            for(int j = 0; j < n - i - 1; j ++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return arr;
    }
    public static float[] BubbleSort(float[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            Boolean swapped = false;
            for(int j = 0; j < n - i - 1; j ++){
                if (arr[j] > arr[j + 1]){
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a = {7, 10, 3, 1, 100, 24, 101, 0};
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        float[] b = {7, 10, 3, 1, 100, 24, 101, 0};
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }

        Sorter.BubbleSort(a);
        Sorter.BubbleSort(b);
        System.out.println("");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}