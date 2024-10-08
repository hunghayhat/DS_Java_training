package Polymorphism;

class Animal2 {
    public void sound(){
        System.out.println("Dong vat keu");
    }
}

class Dog2 extends Animal2 {
    public void sound() {
        System.out.println("Cho sua gau gau");
    }

    public void play() {
        System.out.println("Cho dang choi!");
    }
}


public class Downcasting {
    public static void main(String[] args) {
        Animal2 animal2 = new Dog2();   //upcasting
        animal2.sound();                //output: cho sua gau gau

        Dog2 dog2 = (Dog2) animal2;     //Downcast animal về dog
        dog2.play();                    //output: cho dang choi!
    }
}