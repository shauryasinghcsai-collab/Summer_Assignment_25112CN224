import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UserArrayUnion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> unionSet = new LinkedHashSet<>();

        // 1. Input for the First Array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        
        System.out.println("Enter " + size1 + " elements for the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
            unionSet.add(array1[i]); // Automatically handles uniqueness
        }

        // 2. Input for the Second Array
        System.out.print("\nEnter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        
        System.out.println("Enter " + size2 + " elements for the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
            unionSet.add(array2[i]); // Automatically handles uniqueness
        }

        // 3. Convert the Set back to a final Union Array
        int[] unionArray = new int[unionSet.size()];
        int index = 0;
        for (int num : unionSet) {
            unionArray[index++] = num;
        }

        // 4. Print the results
        System.out.println("\n--- Results ---");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Union of Arrays: " + Arrays.toString(unionArray));
        
        scanner.close();
    }
}
