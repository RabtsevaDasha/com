import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String week;
        System.out.println("Enter day number:");
        int day = scanner.nextInt();

        if (day  == 1) {
            week = "Monday";
        } else if (day == 2) {
            week = "Tuesday";
        } else if (day == 3) {
            week = "Wednesday";
        } else if (day == 4) {
            week = "Thursday";
        }else if (day == 5) {
            week = "Friday";
        } else if (day == 6) {
            week = "Saturday";
        } else if (day == 7) {
            week = "Sunday";
        } else {
            week = "404";
        }
        System.out.println("Day of the week:" + week);
    }
}
