package less_12;
//Д) Есть массив. Найти максимально возможную сумму и минимальную разность элементов

import static sun.management.MemoryUsageCompositeData.getMax;

public class Task_5 {
    public static void main(String[] args) {
        int[] num = new int[]{4, 8, 9, 25, 65, 74, 2, 6};
        int min, max;
        min = max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) min = num[i];
            if (num[i] > max) max = num[i];
        }
        System.out.println("Min: " + min + " " + "Max: " + max);

        int sum = 0;
        for (int arr : num) {
            sum = max + min;
        }
        System.out.println("Summa " + sum);

        int dif =0;
        for (int arr2 : num) {
            dif = max / min;
        }
        System.out.println("Difference " + dif);
    }
}
