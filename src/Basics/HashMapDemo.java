package Basics;

// Import the HashMap class

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.remove("England"));

        System.out.println(capitalCities.size());

        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Hung", 22);
        people.put("Sen", 22);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}
