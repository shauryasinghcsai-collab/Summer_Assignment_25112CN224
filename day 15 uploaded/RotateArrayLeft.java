import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // 2. Get the array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Get the number of positions to rotate
        System.out.print("Enter the number of positions to rotate left: ");
        int d = scanner.nextInt();

        System.out.println("\nOriginal Array: " + Arrays.toString(arr));
        
        // Perform rotation
        rotateLeft(arr, d);
        
        System.out.println("Rotated Array:  " + Arrays.toString(arr));
        
        scanner.close();
    }

    public static void rotateLeft(int[] arr, int d) {
        if (arr == null || arr.length == 0) return;
        
        int n = arr.length;
        // Handles cases where d is greater than the array length
        d = d % n; 

        // Reversal Algorithm
        reverse(arr, 0, d - 1);  // Reverse first part
        reverse(arr, d, n - 1);  // Reverse second part
        reverse(arr, 0, n - 1);  // Reverse whole array
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
