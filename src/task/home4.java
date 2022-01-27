package task;

public class home4 {
    public static void main(String[] args) {
        float distance = 10;
        for (int day = 2; day <= 7; day++){
            distance *= 1.1;
            System.out.println("В день " + day + " спортсмен пробежал " + distance + " km");
        }
    }
}
