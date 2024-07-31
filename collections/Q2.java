package collections;
import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {
        // Create a HashMap with at least 10 key-value pairs of Student ID and Name
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eve");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");

        // Insert a Key-Value mapping into the map
        studentMap.put(111, "Kathy");

        // Fetch the value of a Key
        String name = studentMap.get(103);
        System.out.println("Value for key 103: " + name);

        // Create a clone/copy of HashMap
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) studentMap.clone();

        // Check if the given Key is in the Map
        boolean hasKey = studentMap.containsKey(105);
        System.out.println("Map contains key 105: " + hasKey);

        // Check if the value is in the Map
        boolean hasValue = studentMap.containsValue("Eve");
        System.out.println("Map contains value 'Eve': " + hasValue);

        // Check if the map is empty
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Map is empty: " + isEmpty);

        // Print the size of the Map to the console
        int size = studentMap.size();
        System.out.println("Size of the map: " + size);

        // Print all the Keys of the map to the console
        System.out.println("Keys of the map: " + studentMap.keySet());

        // Print all the Values of the map to the console
        System.out.println("Values of the map: " + studentMap.values());

        // Remove a specific Key-Value pair
        studentMap.remove(104);
        System.out.println("Map after removing key 104: " + studentMap);

        // Copy all the elements of the Map to another Map
        HashMap<Integer, String> anotherMap = new HashMap<>(studentMap);
        System.out.println("Another map: " + anotherMap);
    }
}

