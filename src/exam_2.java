import java.util.Scanner;
//Посчитать сумму четных, нечетных и всех чисел

public class exam_2 {
    public static void main(String[] args) {
         System.out.println("Введите ваше число: ");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
// //What did I say at the previous lesson? We could do it in 1 loop!
         int sum1 = 0;
         for (int i = 1; i < num; i++){
             sum1+=i;
        }
         int sum2 = 0;
         for (int i = 1; i < num; i+=2) {
            sum1 += i;
        }
                System.out.println(sum1);
                System.out.println(sum2);
    }
}
