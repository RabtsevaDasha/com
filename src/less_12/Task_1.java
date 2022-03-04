package less_12;
/*1) Заполнить массив с консоли (предусмотреть исключительные ситуации)
Если пользователь во время заполнения массива вводит отрицательно число,
то инициализацию массива прекратить, вывести сообщение и закончить программу.
Вывести полученный массив с помощью foreach
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the elements of the array: ");
        boolean hasNegative = false;
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
            if (num[i] < 0) {
                hasNegative = true;
                break;
            }
        }
        if (hasNegative) {
            System.out.println("At least one element in array is negative");
        } else {
            System.out.println("Array all elements are positive");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
        }

        System.out.println("The array created is: " + Arrays.toString(num));
        System.out.println("indices of the duplicate elements: ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.print(j);
                }
            }
        }
    }
}
