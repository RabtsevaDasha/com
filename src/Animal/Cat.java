package Animal;

public class Cat extends Animale {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("meow-meow");
    }
}
