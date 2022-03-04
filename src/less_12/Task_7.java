package less_12;
//Ж) Скопировать массив в другой

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int[] arr = {8, 14, 86, 7};
        int[] copyArr = arr.clone();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr) + "\n");
        arr[1] = 66;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr) + "\n");
        copyArr[3] = 5;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr));
    }
}
