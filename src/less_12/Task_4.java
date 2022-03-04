package less_12;
//Г) Есть массив чисел. Разбить его пополам и поместить в соответствующие массивы (предусмотреть нечетную длину!)

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required size of the array: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(myArray));
        int[] myArray1 = Arrays.copyOfRange(myArray, 0, myArray.length / 2);
        int[] myArray2 = Arrays.copyOfRange(myArray, myArray.length / 2, myArray.length);
        System.out.println("First half of the array: " + Arrays.toString(myArray1));
        System.out.println("First second of the array: " + Arrays.toString(myArray2));
    }
}
