package Week2Task2;
import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        if(count < 1 || count > 500){
            System.out.print("Введено недопустимое число " + count + ". Допустимый диапазон значений: 1 - 500");
        } else {
            for (int i = 1; count >= i; i++){
                System.out.print(i * 7 + " ");

            }
        }

    }

}