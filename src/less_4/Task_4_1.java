package less_4;

//Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class Task_4_1 {
    public static void main(String[] args) {
        int hr = 0;
        int amb = 1;

        for (int i = 1; i <= 8; i++) {
            amb *= 2;
            hr += 3;
            System.out.println("Количество амёб через " + hr + " часов будет " + amb);

        }
    }
}
