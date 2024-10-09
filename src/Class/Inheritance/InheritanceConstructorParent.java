package Class.Inheritance;

class Parent {
    public Parent () {
        System.out.println("Constructor của Parent được gọi");
    }

    public Parent(String message) {
        System.out.println("Parent: " + message);
    }
}

class Child extends Parent {
    public Child(){
        System.out.println("Constructor của Child được gọi");
    }

    public Child (String message) {
        super(message); //Gọi constructor có tham số của lớp cha
        System.out.println("Child: " + message);
    }
}

public class InheritanceConstructorParent {
    public static void main(String[] args) {
        Child child1 = new Child();              // Constructor không tham số => Khi gọi constructor của nó thì constructor không tham số của Parent sẽ được gọi trước
        Child child2 = new Child("Hello!");
    }
}
