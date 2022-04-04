package less_7;

import java.util.Scanner;
import java.util.Arrays;

public class Exam_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choice array: ");
        if (initialize(sc) == 1) {
            String[] words = new String[initLength(sc)];
            initStrArray(words, sc);
            sortStrArray(words);
            replaceLetter(words, sc);
        } else {
            int[] numbers = new int[initLength(sc)];
            numsArray(numbers, sc);
            max(numbers);
            min(numbers);
            returnIndex(numbers, sc);
            sortInt(numbers);
        }
    }
//getRandomNum
    public static int getRandomNum(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void numsArray(int[] arr, Scanner sc) {
        boolean correctData = false;
        int result = 0;
        while (!correctData) {
            System.out.println("1 - from console");
            System.out.println("2 - random");
            System.out.println("Select the array type: ");
            result = sc.nextInt();
            if (result == 1 || result == 2) {
                correctData = true;
                continue;
            }
            System.out.println("Try again!");
        }
        if (result == 1) {
            initConsoleArray(arr, sc);
        } else {
            initRandomArray(arr);
        }
    }
//initConsoleArray
    public static void initConsoleArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input value of " + i + " element: ");
            arr[i] = sc.nextInt();
        }
    }
//initRandomArray
    public static void initRandomArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNum(99, 5);
        }
//another method. 
        System.out.println("Original array");
        System.out.println(Arrays.toString(arr));
    }

    public static int max(int[] arr) {
//element, not el
        int element = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (element < arr[i]) {
                element = arr[i];
            }
        }
//move it to another method
        System.out.println("Max element: " + element);
        return element;
    }

    public static int min(int[] arr) {
//element, not el
        int element = arr[0];
        for (int i = 0; i != arr.length; i++) {
            if (element > arr[i]) {
                element = arr[i];
            }
        }
//Print it after. Not in this method
        System.out.println("Min element: " + element);
        return element;
    }

    public static int returnIndex(int[] arr, Scanner sc) {
        int number = 0;
        System.out.println("Enter number whose index you want to find: ");
        number = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                System.out.println("Index: " + i);
                return i;
            }
        }
//print it after. Not in this method
        System.out.println("Index: " + -1);
        return -1;
    }

    public static void sortInt(int[] arr) {
        Arrays.sort(arr);
//should be placed in another method 
        System.out.println("Array of sort: ");
        System.out.println(Arrays.toString(arr));
    }

    public static int initialize(Scanner sc) {
        boolean correctData = false;
        int result = 0;
        while (!correctData) {
            System.out.println("1 - words");
            System.out.println("2 - numbers");
            System.out.println("Select the array type: ");
            result = sc.nextInt();
            if (result == 1 || result == 2) {
                correctData = true;
                continue;
            }
            System.out.println("Try again!");
        }
        return result;
    }
//getArrayLength or initLength
    public static int initLength(Scanner sc) {
        int length = 0;
        while (length <= 0) {
            System.out.println("Input array length: ");
            length = sc.nextInt();
        }
        return length;
    }
//initStrArray
    public static void initStrArray(String[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input value of " + (i + 1) + " word: ");
            arr[i] = sc.next();
        }
//place it in a different method
        System.out.println("Original array");
        System.out.println(Arrays.toString(arr));
    }
//make this method overloaded. You have already sorting method
    public static void sortStrArray(String[] arr) {
        Arrays.sort(arr);
//different method
        System.out.println("Array of sort: ");
        System.out.println(Arrays.toString(arr));
    }

//replaceLetter
    public static void replaceLetter(String[] arr, Scanner sc) {
        boolean correct = false;
        String letter = "";
        while (!correct) {
            System.out.println("Input letter: ");
            letter = sc.next();
            if (letter.length() == 1) {
                correct = true;
                continue;
            }
            System.out.println("Try again!");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replace(letter, Integer.toString(getRandomNum(99, 5)));
        }
//place printing in a different method 
        System.out.println("Array after replacement: ");
        System.out.println(Arrays.toString(arr));
    }

}
