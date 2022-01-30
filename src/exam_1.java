import java.util.Scanner;

//Реализуйте калькулятор с возможностью постоянного ввода числа

public class exam_1 {
    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double answ;
        String op;
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = sc.next();
        //use text formatting
        switch (op){
            case "+": answ = num1 + num2; break;
            case "-": answ = num1 - num2; break;
            case "*": answ = num1 * num2; break;
                //if we divide 2 int numbers, then we will lose some data. Use double instead. And what if num2 is 0?
            case "/": answ = num1 / num2; break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + answ);
        System.out.println("\nDo you want to continue?\n");

    }
}
