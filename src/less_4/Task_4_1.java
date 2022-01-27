package less_4;

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
