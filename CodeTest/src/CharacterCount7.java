import java.util.HashMap;
import java.util.Map;

public class CharacterCount7 {
    public static void main(String[] args) {
        String inputString = "Hello World";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to a char array
        char[] strArray = inputString.toCharArray();

        // Iterate over the char array
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                // If char is already present in the map, increment its count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If char is not present in the map, put it with count 1
                charCountMap.put(c, 1);
            }
        }

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            if (entry.getValue() > 1) {
                System.out.println("Duplicate element: " + entry.getKey() + " occurs " + entry.getValue() + " times.");
            }
        }
    }
}