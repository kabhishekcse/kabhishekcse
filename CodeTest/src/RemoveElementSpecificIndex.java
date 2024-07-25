import java.util.Arrays;

public class RemoveElementSpecificIndex {

    // Method to remove an element at a specific index
    public static int[] removeElement(int[] originalArray, int index) {
        if (index < 0 || index >= originalArray.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        int[] newArray = new int[originalArray.length - 1];
        for (int i = 0, k = 0; i < originalArray.length; i++) {
            if (i == index) {
                continue; // Skip the element at the specified index
            }
            newArray[k++] = originalArray[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int indexToRemove = 2; // Removing the element at index 2 (value 3)
        int[] newArray = removeElement(myArray, indexToRemove);

        System.out.println("Original array: " + Arrays.toString(myArray));
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}
