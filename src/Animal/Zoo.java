package Animal;

public class Zoo {
    private int count;
    private Animale[] animalesArray;

    public Zoo() {
        this.count = 0;
        this.animalesArray = new Animale[10];
    }

    public void addAnimale(Animale animale) {
        animalesArray[count]= animale;
        count++;
    }
    public void soundOff(){
        System.out.println("Animals " + count);
        for (int i = 0; i < count; i++) {
            animalesArray[i].sound();//и так делает sout()
            System.out.print(animalesArray[i].getName());
            System.out.println();
        }
    }
}
