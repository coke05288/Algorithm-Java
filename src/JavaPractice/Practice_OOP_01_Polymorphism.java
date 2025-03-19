package JavaPractice;

import java.util.ArrayList;
import java.util.List;

abstract class Character {
    String name;

    Character(String name){
        this.name = name;
    }

    abstract void attack(); // 다형성(Polymorphism) 추상 함수를 만들어 Sub Class 에서 다른 동작을 수행하도록 함
}

class Warrior extends Character{
    Warrior(String name){
        super(name);
    }

    @Override
    public void attack(){
        System.out.println(name + " swings a sword!");
    }
}

class Mage extends Character{
    Mage(String name){
        super(name);
    }

    @Override
    public void attack(){
        System.out.println(name + " casts a fireball");
    }

    public void heal(){
        System.out.println(name + " casts a heal");
    }
}

class Game {
    static void attack(Character character){
        character.attack();
    }
}

class Player {
    private Character character;

    Player(Character character){
        this.character = character;
    }

    public void startBattle(){
        character.attack();
    }
}

public class Practice_OOP_01_Polymorphism {
    public static void main(String[] args){
        // new Mage 객체는 Character 타입으로 업캐스팅
        // mage 객체는 Character 타입이므로, 부모 클래스에 있는 메소드만 사용 가능
        // 하지만, Overriding 된 warrior 객체의 attack()은 Warrior 클래스의 형태로 사용이 가능해짐
        Character warrior = new Warrior("A");
        Character mage = new Mage("B");

        // 1. 부모 타입으로 객체 관리가 용이해짐
        System.out.println("----- Ex 1 -----");
        List<Character> characterList = new ArrayList<>();
        characterList.add(new Warrior("C"));
        characterList.add(new Mage("D"));

        for (Character character : characterList){
            character.attack();
        }

        System.out.println();

        // 2. 결합도를 높혀 유지보수성을 높임
        System.out.println("----- Ex 2 -----");
        Game.attack(warrior);

        System.out.println();

        // 3. 의존성을 줄여 테스트와 모킹(Mocking)이 쉬워짐
        System.out.println("----- Ex 3 -----");
        Player player = new Player(characterList.get(1));
        player.startBattle();

        System.out.println();
    }
}
