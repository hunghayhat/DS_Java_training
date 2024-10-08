package Polymorphism;

class Animal {
    // Method that will be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Superclass reference to subclass objects
        Animal myAnimal; // Reference of type Animal

        myAnimal = new Dog();  // Points to Dog object
        myAnimal.sound();      // Outputs: Dog barks

        myAnimal = new Cat();  // Points to Cat object
        myAnimal.sound();      // Outputs: Cat meows
    }
}

