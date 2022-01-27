package less_4;

//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
public class Task_4_2 {
    public static void main(String[] args) {
        int a = 1, b = 3, p = 0, i;

        for (i =1; i < 5; i++){
            p = p+a+b;
            System.out.println("A*B = " + p);
        }
    }
}