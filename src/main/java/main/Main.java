package main;

import logic.*;

public class Main {
    public static void main(String[] args) {
        new  Main().run();
    }

    private void run(){
        Animal dog = new Dog("Luna", 2);
        Dog angryDog = new AngryDog("Bosya", 5);
        Animal cat = new Cat("Mura", 4);
        Animal cow = new Cow("Milka", 9);
        Animal [] animals = {dog,angryDog,cat,cow};
        for (Animal a: animals) {
            a.makeSomeVoice();
        }
    }
}
