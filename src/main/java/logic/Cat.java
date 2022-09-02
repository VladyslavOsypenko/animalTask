package logic;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSomeVoice() {
        System.out.println("Mew Mew");
    }
}
