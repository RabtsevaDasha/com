package Man;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Harry", "Styles", 28);

        person1.name = "Kodi";
        person1.fullName = "Rosand";
        person1.age = 24;

        System.out.println("Name: " + person1.name);
        System.out.println("Full name: " + person1.fullName);
        System.out.println("Age: " + person1.age);
        System.out.println();

        System.out.println("Name: " + person2.name);
        System.out.println("Full name: " + person2.fullName);
        System.out.println("Age: " + person2.age);

        person1.move("Kodi");
        person2.talk("Harry");

        System.out.println(Person.getCount());
    }
}
