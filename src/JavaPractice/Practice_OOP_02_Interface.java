package JavaPractice;

import java.util.ArrayList;
import java.util.List;

interface SoundComponent {
    void makeSound();
}

class Cat implements SoundComponent{
    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
}

class Dog implements SoundComponent{
    @Override
    public void makeSound(){
        System.out.println("Bark!");
    }
}

public class Practice_OOP_02_Interface {
    public static void main(String[] args){
        List<SoundComponent> animals = new ArrayList<SoundComponent>();
        animals.add(new Dog());
        animals.add(new Cat());

        for(SoundComponent check : animals){
            check.makeSound();
        }
    }
}
