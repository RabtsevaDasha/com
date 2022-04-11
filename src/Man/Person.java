package Man;

import java.util.Objects;

public class Person {
    String name;
    String fullName;
    int age;

    public Person() {
    }

    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    void move (String name){
        System.out.println(name + " walk");
    }
    void talk (String name){
        System.out.println(name + " talk \"Hi girls!\"");
    }


}
