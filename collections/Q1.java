package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        // Create an ArrayList of type String
        ArrayList<String> list = new ArrayList<>();

        // Add 10 string elements to the ArrayList
        for (int i = 1; i <= 10; i++) {
            list.add("Element " + i);
        }

        // Add an element to the ArrayList
        list.add("New Element");

        // Iterate through the ArrayList using Iterator object
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add an element at a specific index
        list.add(5, "Inserted Element");

        // Remove an element from the ArrayList
        list.remove("Element 3");

        // Remove an element at a specific index
        list.remove(2);

        // Update the element at a specific index
        list.set(4, "Updated Element");

        // Check if an element is present at a particular index
        boolean isPresent = list.get(4).equals("Updated Element");
        System.out.println("Element at index 4 is 'Updated Element': " + isPresent);

        // Get an element at a particular index
        String element = list.get(3);
        System.out.println("Element at index 3: " + element);

        // Find out the size of the ArrayList
        int size = list.size();
        System.out.println("Size of the ArrayList: " + size);

        // Check if a given element is present in the ArrayList
        boolean contains = list.contains("Element 5");
        System.out.println("ArrayList contains 'Element 5': " + contains);

        // Remove all elements of the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);
    }
}

