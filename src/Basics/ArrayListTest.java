package Basics;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("Lexus");
        cars.add("Bentley");
        cars.add("Mercedes");

        cars.add(1, "Mazda");
        System.out.println(cars);

        System.out.println(cars.get(3)); // get an element

        cars.set(0, "Opel"); // set a value for an element

        cars.removeFirst();

    }
}
