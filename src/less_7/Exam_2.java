package less_7;

import java.util.Scanner;
//Посчитать сумму четных, нечетных и всех чисел

public class Exam_2 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
// //What did I say at the previous lesson? We could do it in 1 loop!
        int evenSum=0, oddSum=0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else oddSum += i;//use {..}
        } int sum=evenSum+oddSum;//new line
        System.out.println("Sum of even numbers: "+evenSum+"\nSum of odd numbers: "+oddSum+"\nTotal sum: "+sum);
    }
}
