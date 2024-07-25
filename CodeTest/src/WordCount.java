import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "Hello world Hello";

        Map<String, Long> wordCountMap = Arrays.stream(inputString.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        wordCountMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}