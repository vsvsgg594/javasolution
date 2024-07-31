package collections;

import java.util.HashSet;

public class Q3 {
    public static void main(String[] args) {
        // Create a HashSet with at least 10 elements of type String
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");
        set.add("Fig");
        set.add("Grape");
        set.add("Honeydew");
        set.add("Indian Fig");
        set.add("Jackfruit");

        // Add an element to the HashSet
        set.add("Kiwi");

        // Check if an element is present in the HashSet
        boolean containsElement = set.contains("Cherry");
        System.out.println("HashSet contains 'Cherry': " + containsElement);

        // Remove an element from the HashSet
        set.remove("Date");

        // Check if the HashSet is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("HashSet is empty: " + isEmpty);

        // Find out the size of the HashSet
        int size = set.size();
        System.out.println("Size of the HashSet: " + size);

        // Iterate through the HashSet
        System.out.println("Elements in the HashSet:");
        for (String element : set) {
            System.out.println(element);
        }

        // Clear all elements from the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}
