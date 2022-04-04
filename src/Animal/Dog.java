package Animal;

public class Dog extends Animale {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("woof-woof");
    }
}
