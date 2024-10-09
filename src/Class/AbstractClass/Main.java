package Class.AbstractClass;

abstract class Animal {
    //abstract method does not have body
    public abstract void animalSound();

    //regular method
    public void sleep() {
        System.out.println("ZZZ");
    }
}

class Bird extends Animal {
    public void animalSound() {
        //the body of animalSound()
        System.out.println("The bird say: chip chip");
    }
}
public class Main {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.animalSound();
        myBird.sleep();
    }
}
