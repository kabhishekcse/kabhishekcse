import java.util.ArrayList;
import java.util.List;

public class PeakElement {
    // Function to find all peak elements
    public static List<Integer> findAllPeakElements(int[] array) {
        int n = array.length;
        List<Integer> peaks = new ArrayList<>();

        // Traverse the array to find peak elements
        for (int i = 0; i < n; i++) {
            // Check the first element
            if (i == 0 && array[i] >= array[i + 1]) {
                peaks.add(array[i]);
            }
            // Check the last element
            else if (i == n - 1 && array[i] >= array[i - 1]) {
                peaks.add(array[i]);
            }
            // Check all other elements
            else if (i > 0 && i < n - 1 && array[i] >= array[i - 1] && array[i] >= array[i + 1]) {
                peaks.add(array[i]);
            }
        }

        return peaks;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 15, 2, 23, 90, 67};
        List<Integer> peaks = findAllPeakElements(array);
        System.out.println("Peak elements are: " + peaks);
    }
}
