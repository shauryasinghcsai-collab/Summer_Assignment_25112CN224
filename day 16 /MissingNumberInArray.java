import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the total range 'n' from the user
        System.out.print("Enter the total number of elements expected (n): ");
        int n = scanner.nextInt();

        // The array size will be n - 1 because one number is missing
        int[] arr = new int[n - 1];

        // 2. Get the array elements from the user
        System.out.println("Enter the " + (n - 1) + " numbers (space-separated or line-by-line):");
        int actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
            actualSum += arr[i]; // Add to sum as we receive input
        }

        // 3. Calculate expected sum using long to prevent integer overflow
        long expectedSum = (long) n * (n + 1) / 2;

        // 4. Find and display the missing number
        long missingNumber = expectedSum - actualSum;
        System.out.println("---");
        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
}

