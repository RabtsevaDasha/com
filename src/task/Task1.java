package task;

import java.util.Scanner;

public class Task1 {
           public static void main(String[] args) {
               int counter = 10;
               while (counter >= 0) {
                  System.out.println(counter + "sec. left");
                  counter--;

               }
               //====sum====
               int sum = 0;
               System.out.println("Enter number: ");
               Scanner scanner = new Scanner(System.in);
               int inputNumber = scanner.nextInt();
               double i = 1;
               while (i <= inputNumber) {
                   sum += 1 / i;
                   i++;
               }
               System.out.println(sum);

               int x = 10;

               do {
                   System.out.println("Значение х:" + x );
                   x++;
                   System.out.print("\n");
               } while ( x < 15);
           }
}
