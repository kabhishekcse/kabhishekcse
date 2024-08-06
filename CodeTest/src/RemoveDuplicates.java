import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) return 0;

        int uniqueCount = 1; // At least one unique element in the array

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 2, 5};
        int length = removeDuplicates(nums);
        int[] arrayWithoutDuplicates = Arrays.copyOf(nums, length);
        //System.out.println("arrayWithoutDuplicates elements: " + Arrays.toString(arrayWithoutDuplicates));
        // or copyOfRange
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOfRange(nums, 0, length)));
        System.out.println("Number of unique elements: " + length);
    }
}
