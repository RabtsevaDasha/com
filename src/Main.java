import java.util.Scanner;

import static less_12.Task_1.findCount;

public class Main {
    public static int[] main(String[] args) {
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
        System.out.println("Enter a number!");
        int num1 = sc.nextInt();
        sc.nextLine();
//        int[] array = new int[num1];
        int[] array = new int[size];
        System.out.println("Enter another number!");
        int num2 = sc.nextInt();
        int[] array2 = new int[num2];
        int[] result = findCount(size);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        if ((size % num2) == 0) {
            System.out.println("Yes! " + size + " is a multiple of " + num2 + "!");
        } else {
            System.out.println("No! " + size + " is not a multiple of " + num2 + "!");
        }
        sc.close();
        int[] arr = new int[size];
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    result[i]++;
            }
        }
        return result;




    }
}
