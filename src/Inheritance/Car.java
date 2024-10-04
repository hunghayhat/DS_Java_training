package Inheritance;

public class Car {
    protected String brand = "Porsche";

    public void honk() {
        System.out.println("Bíp bíp");
    }
}

class myCar extends Car {
    private int licensePlateNumber = 22222;

    public static void main(String[] args) {
        myCar tienTM = new myCar();
        tienTM.honk();
        System.out.println("Xe " + tienTM.brand + " của anh Tiến có biển số là " + tienTM.licensePlateNumber);
    }
}
