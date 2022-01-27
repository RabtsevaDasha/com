package less_4;

/*Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой суммарный путь пробежит спортсмен за 7 дней?
 */

public class Task_4_4 {
    public static void main(String[] args) {
        float distance = 10;
        for (int day = 2; day <= 7; day++){
            distance *= 1.1;
            System.out.println("В день " + day + " спортсмен пробежал " + distance + " km");
        }
    }
}
