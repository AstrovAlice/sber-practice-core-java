package Week2Task2;
import java.util.Random;

public class Task6 {

    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        int max = Integer.MIN_VALUE;
        float sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1001);
            sum += array[i];
            if (array[i] > max) {
                max = array[i];
            }
        }

        float average = sum / array.length;

        System.out.println("Максимальное значение = " + max + " находится в элементе под индексом " + findIndex(array, max));
        System.out.println("Среднее значение = " + average);
    }

    public static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
