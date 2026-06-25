import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 5, 2, 9, 8};

        // 1. Convert array to LinkedHashSet to remove duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(numbers));

        // 2. Convert the set back into an array
        Integer[] uniqueNumbers = set.toArray(new Integer[0]);

        // Print the result
        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Unique Array: " + Arrays.toString(uniqueNumbers));
    }
}
