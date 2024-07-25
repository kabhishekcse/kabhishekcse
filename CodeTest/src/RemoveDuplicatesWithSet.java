import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesWithSet {

    public static int[] removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int[] newArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            newArray[index++] = num;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int[] uniqueArray = removeDuplicates(nums);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}
