package less_5;
//Напишите программу вывода всех четных чисел от 2 до 100 включительно

public class Task_5_2 {
    public static void main(String[] args) {
        int i = 1;
        final int max = 100;
        while (i <= max) {
            i++;
            {
                if (i % 2 != 0)
                    continue;
                System.out.print(i + " ");
            }
        } System.out.print(" - are even numbers");

    }
}
