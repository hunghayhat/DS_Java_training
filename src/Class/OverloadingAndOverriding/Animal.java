package Class.OverloadingAndOverriding;
//Phương thức sound() của lớp Cat ghi đè lên phương thức sound() của Animal
public class Animal {
    public void sound() {
        System.out.println("Animal makes sound!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("meow meow");
    }
}
