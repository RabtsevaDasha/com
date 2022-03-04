package less_12;
//Е) Удалить из массива определенное число

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] num = {7, 15, 65, 23, 8, 45};
        int[] newArr = null;
        int elementToBeDeleted = 4;
        System.out.println("Original Array is: "+ Arrays.toString(num));
        for (int i = 4; i < num.length-1; i++) {
            num[i-1] = num[i];
            num[i] = 0;
        }
        System.out.println("New Array after deleting element = "+elementToBeDeleted+" and shifting: "+ Arrays.toString(num));
    }
}
