import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount1 {
    public static void main(String[] args) {
        // Java program to demonstrate
// Collectors groupingBy() method
// Get the List
        List<String> g
                = Arrays.asList("geeks", "for", "geeks", "ravi");

        // Collect the list as map
        // by groupingBy() method
        Map<String, Long> result
                = g.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        // Print the result
        System.out.println(result);
        result.forEach((k, v) -> System.out.println(k + ": " + v));
    }


}