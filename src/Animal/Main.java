package Animal;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimale(new Dog("Vilhelm"));
        zoo.addAnimale(new Cat("Mishel"));
        zoo.soundOff();
    }
}
