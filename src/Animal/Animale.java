package Animal;

public class Animale {
    private String name;

    public Animale(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Sound: ");
    }

    public String getName() {
        return name;
    }
}
