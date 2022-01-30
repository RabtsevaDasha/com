import java.util.Scanner;
//Посчитать сумму четных, нечетных и всех чисел

public class exam_2 {
    public static void main(String[] args) {
         System.out.println("Введите ваше число: ");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();

         int sum = 0;
         for (int i = 1; i < num; i++){
             sum+=i;
        }
                System.out.println(sum);
    }
}
