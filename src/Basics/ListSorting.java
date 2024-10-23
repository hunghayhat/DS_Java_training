package Basics;

import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class ListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers, Collections.reverseOrder()); // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}