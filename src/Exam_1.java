import java.util.Scanner;

//Реализуйте калькулятор с возможностью постоянного ввода числа

public class Exam_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double answ;
        String op;
        String ans2;
        do {
            System.out.print("Enter number 1: ");
            num1 = sc.nextDouble();
            System.out.print("Enter number 2: ");
            num2 = sc.nextDouble();
            System.out.print("Enter an operator (+, -, *, /): ");
            op = sc.next();
            //use text formatting
            switch (op) {
                case "+": answ = num1 + num2; break;
                case "-": answ = num1 - num2; break;
                case "*": answ = num1 * num2; break;
                //if we divide 2 int numbers, then we will lose some data. Use double instead. And what if num2 is 0?
                case "/": answ = num1 / num2; break;
                default:
                    System.out.print("Error! Enter correct operator");
                    return;
            }
            System.out.println("\nThe result is given as follows:");
            System.out.println(num1 + " " + op + " " + num2 + " = " + answ);
            //you do not have a loop! Your's program will just finish, but I need it to work till I enter stop word
            System.out.println("Do you want to continue?");
            ans2 = sc.next();
//ans2.equalsIgnoreCase(...). What if I enter "hello" instead of "yes"/"no"?
//did you test your program? You do not have a loop to repeat. You will be just cut off and the program will stop.
             } while (ans2.toLowerCase().contains("yes"));
        System.out.println("You are done calculating!");
        }
    }
