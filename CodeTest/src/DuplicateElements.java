import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {
  public static void main(String args[]) {
          List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
          Set<Integer> set = new HashSet();
          myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);
          //-----

      List<Integer> myList1 = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
    //  myList1.stream().distinct().forEach(noDuplicateData -> System.out.println("noDuplicateData "+noDuplicateData));

      ///////////Print the unique elements
      List<Integer> myList2 = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
      Set<Integer> set1 = new HashSet<>(myList2);

      // Convert the set back to a list if needed
      List<Integer> uniqueData = set1.stream().collect(Collectors.toList());

      // Print the unique elements
     // uniqueData.forEach(System.out::println);
  }
}