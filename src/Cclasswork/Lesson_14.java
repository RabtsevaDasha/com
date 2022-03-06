package Cclasswork;

public class Lesson_14 {
    //StringBuffer(); StringBulder()
//Benchmark


    //Сравнить строки лексикографически
    public static void main(String[] args) {
        String str = "dreams";
        String str2 = " time";
        int getValue = compareString(str, str2);
        getComparisonResult(getValue, str, str2);
    }

    private static int compareString(String str, String str2) {
        for (int i = 0; i < str.length() && i < str2.length(); i++) {
            if ((int) str.charAt(i) == (int) str2.charAt(i)) {
                continue;
            } else {
                return (int) str.charAt(i) - (int) str2.charAt(i);
            }
        }
        if (str.length() < str2.length()) {
            return (str.length() - str2.length());
        } else if (str.length() > str2.length()) {
            return (str.length() - str2.length());
        } else {
            return 0;
        }
    }

    private static void getComparisonResult(int getValue, String str, String str2) {
        if (getValue > 0) {
            System.out.println(str + " comes after " + str2);
        } else if (getValue < 0) {
            System.out.println(str + " comes before " + str2);
        }else {
            System.out.println(str + " and " + str2 + " are equal");
        }
    }


}
