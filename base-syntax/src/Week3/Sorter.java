package Week3;

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
    public static void main(String[] args) {
        int[] a = {7, 10, 3, 1, 100, 24, 101, 0};
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        Sorter.BubbleSort(a);
        System.out.println("");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}