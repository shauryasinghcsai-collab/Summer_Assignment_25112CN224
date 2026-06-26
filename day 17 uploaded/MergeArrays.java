import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input for the First Array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.print("Enter elements for the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // 2. Input for the Second Array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.print("Enter elements for the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // 3. Create a new array to hold both
        int[] mergedArray = new int[size1 + size2];

        // 4. Copy elements using System.arraycopy (Most efficient way)
        // Syntax: arraycopy(src, srcPos, dest, destPos, length)
        System.arraycopy(array1, 0, mergedArray, 0, size1);
        System.arraycopy(array2, 0, mergedArray, size1, size2);

        // 5. Print the merged array
        System.out.println("\nFirst Array: " + Arrays.toString(array1));
        System.out.println("Second Array: " + Arrays.toString(array2));
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

        scanner.close();
    }
}
