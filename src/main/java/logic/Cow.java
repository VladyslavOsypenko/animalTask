package logic;

public class Cow extends Animal{
    public Cow(String name, int age) {
        super(name, age);
    }

    public void makeSomeVoice() {
        System.out.println("Muu Muu");
    }
}
