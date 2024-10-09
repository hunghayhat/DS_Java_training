package Class.Polymorphism;

public class Fashion {
    public void shoe(){
        System.out.println("This is a couple of shoes");
    }
}

class Nike extends Fashion {
    public void shoe() {
        System.out.println("This is Nike shoe");
    }
}

class Adidas extends Fashion {
    public void shoe () {
        System.out.println("This is Adidas shoe");
    }
}

class Main{
    public static void main(String[] args) {
        Fashion myFashion = new Fashion();
        Nike myNike = new Nike();
        Adidas myAdidas = new Adidas();

        myFashion.shoe();
        myAdidas.shoe();
        myNike.shoe();
    }
}
