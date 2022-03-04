package less_12;
//В) Заполнить массив рандомными числами. Вывести второй максимальный и минимальный элемент

import java.util.Scanner;

import static sun.management.MemoryUsageCompositeData.getMax;

public class Task_3 {
    public static void main(String[] args) {
        int[] num = {5, 7, 6, 8, 12, 1, 9};
        int max = (int) getMax (num);
        System.out.println("Maximum Value is: "+max);
        int min = (int) getMin (num);
        System.out.println("Minimum Value is: "+min);
    }

    private static Object getMin(int[] num) {
        int maxValue = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < maxValue){
                maxValue = num[i];
            }
        }
        return maxValue;
    }

    private static Object getMax(int[] num) {
        int minValue = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > minValue){
                minValue = num[i];
            }
        }
        return minValue;
    }
}
