package Class.Polymorphism;


class Animal1 {
    public void sound(){
        System.out.println("Dong vat keu");
    }
}

class Dog1 extends Animal1 {
    public void sound() {
        System.out.println("Cho sua gau gau");
    }
}


public class Upcasting {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        Animal1 animal1 = dog;
        animal1.sound();
    }
}