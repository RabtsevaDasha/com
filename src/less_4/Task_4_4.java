package less_4;

public class Task_4_4 {
    public static void main(String[] args) {
        float distance = 10;
        for (int day = 2; day <= 7; day++){
            distance *= 1.1;
            System.out.println("В день " + day + " спортсмен пробежал " + distance + " km");
        }
    }
}
