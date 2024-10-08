package ThisAndSuper;

public class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created");
    }
}

class Bike extends Vehicle {
    Bike() {
        System.out.println("Bike is created!");
    }

    Bike(String brand) {
        super();
//        this(); //chỉ có thể dùng 1 trong 2 phương thức để khởi tạo constructor
        System.out.println("Bike's brand is: " + brand);
    }
}

class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Honda");

    }
}
