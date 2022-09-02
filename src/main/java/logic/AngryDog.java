package logic;

public class AngryDog extends Dog{

    public AngryDog(String name, int age) {
        super(name, age);
    }

    public void makeSomeVoice(){
        System.out.println("GAF GAF!!!");
    }
}
