import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(scanner.in);

        // 1. Take array size input from user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // 2. Take array elements input from user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Process the array to move zeros to the end
        moveZerosToEnd(arr);

        // 4. Print the modified array
        System.out.println("Array after shifting zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }

    public static void moveZerosToEnd(int[] arr) {
        int insertPos = 0; // Pointer to keep track of where the next non-zero element goes

        // Traverse the array. If the element is non-zero, move it to 'insertPos'
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }

        // Fill the rest of the array with zeros
        while (insertPos < arr.length) {
            arr[insertPos] = 0;
            insertPos++;
        }
    }
}
