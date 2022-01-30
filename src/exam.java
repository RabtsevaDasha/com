import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int answ;
        char op;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = sc.next().charAt(0);
        switch (op){
            case '+': answ = num1 + num2; break;
            case '-': answ = num1 - num2; break;
            case '*': answ = num1 * num2; break;
            case '/': answ = num1 / num2; break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + answ);
    }
}
