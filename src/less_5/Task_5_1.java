package less_5;

public class Task_5_1 {
    public static void main(String[] args) {
        int m = 256;
        int s = 1;
        int i = 1;
        while (i < m){
            i *= 2;
            s += i;
        }
           System.out.println("Сумма всех чисел = " + s);
    }
}
