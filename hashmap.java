import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a hashmap
        Map<String, String> hashmap = new HashMap<>();

        // Adding key-value pairs to the hashmap
        hashmap.put("key1", "value1");
        hashmap.put("key2", "value2");
        hashmap.put("key3", "value3");

        // Accessing values using keys
        System.out.println("Value associated with 'key1': " + hashmap.get("key1"));
        System.out.println("Value associated with 'key2': " + hashmap.get("key2"));
        System.out.println("Value associated with 'key3': " + hashmap.get("key3"));

        // Checking if a key is present in the hashmap
        String keyToCheck = "key2";
        if (hashmap.containsKey(keyToCheck)) {
            System.out.println("'" + keyToCheck + "' is present in the hashmap. Its value is: " + hashmap.get(keyToCheck));
        } else {
            System.out.println("'" + keyToCheck + "' is not present in the hashmap.");
        }

        // Removing a key-value pair from the hashmap
        String keyToRemove = "key1";
        if (hashmap.containsKey(keyToRemove)) {
            hashmap.remove(keyToRemove);
            System.out.println("'" + keyToRemove + "' has been removed from the hashmap.");
        } else {
            System.out.println("'" + keyToRemove + "' is not present in the hashmap.");
        }

        // Iterating over the keys in the hashmap
        System.out.println("Keys in the hashmap:");
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }

        // Iterating over the values in the hashmap
        System.out.println("Values in the hashmap:");
        for (String value : hashmap.values()) {
            System.out.println(value);
        }
    }
}
