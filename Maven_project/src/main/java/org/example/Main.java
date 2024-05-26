package org.example;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class Sorter {
        public static int[] bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }

        public static long[] bubbleSort(long[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        long temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }

        public static int[] quickSort(int[] arr) {
            quickSortHelper(arr, 0, arr.length - 1);
            return arr;
        }

        private static void quickSortHelper(int[] arr, int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);
                quickSortHelper(arr, low, pi - 1);
                quickSortHelper(arr, pi + 1, high);
            }
        }

        private static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }

        public static long[] quickSort(long[] arr) {
            quickSortHelper(arr, 0, arr.length - 1);
            return arr;
        }

        private static void quickSortHelper(long[] arr, int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);
                quickSortHelper(arr, low, pi - 1);
                quickSortHelper(arr, pi + 1, high);
            }
        }

        private static int partition(long[] arr, int low, int high) {
            long pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            long temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }
    }

    public static void main(String[] args) {
        int[] unsortedArrInt = {64, 34, 25, 12, 22, 11, 90, 123, 88};
        long[] unsortedArrLong = {9999999999L, 8888888888L, 7777777777L, 6666666666L, 5555555555L};

        int[] sortedArrBubbleInt = Sorter.bubbleSort(unsortedArrInt);
        long[] sortedArrBubbleLong = Sorter.bubbleSort(unsortedArrLong);

        int[] sortedArrQuickInt = Sorter.quickSort(unsortedArrInt);
        long[] sortedArrQuickLong = Sorter.quickSort(unsortedArrLong);

        System.out.println("Sorted array (int) using Bubble Sort: " + Arrays.toString(sortedArrBubbleInt));
        System.out.println("Sorted array (long) using Bubble Sort: " + Arrays.toString(sortedArrBubbleLong));
        System.out.println("Sorted array (int) using Quick Sort: " + Arrays.toString(sortedArrQuickInt));
        System.out.println("Sorted array (long) using Quick Sort: " + Arrays.toString(sortedArrQuickLong));
    }
}