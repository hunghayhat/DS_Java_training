package Class.Interface;

public class Main {
    public static void main(String[] args) {
        SpiderMan mySpiderMan = new SpiderMan();
        mySpiderMan.animalSound();
        mySpiderMan.sleep();
        mySpiderMan.humanSound();
        mySpiderMan.humanAction();
    }
}

interface Animal{
    public void animalSound();
    public void sleep();
}

interface Human {
    public void humanSound();
    public void humanAction();
}

//Multiple Interfaces
class SpiderMan implements Animal, Human {
    public void animalSound() {
        System.out.println("Wee Wee");
    }

    public void sleep() {
        System.out.println("ZZZ");
    }

    public void humanSound() {
        System.out.println("Let's gooooo!");
    }

    public void humanAction() {
        System.out.println("Study!");
    }
}
