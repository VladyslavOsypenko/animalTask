package logic;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSomeVoice() {
        System.out.println("Gaf Gaf");
    }
}
