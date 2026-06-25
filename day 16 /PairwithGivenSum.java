import java.util.Scanner;
import java.util.HashSet;

public class PairWithSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take array size input
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // 2. Take array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Take the target sum input
        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        // 4. Find and print the pair
        findPair(arr, targetSum);

        scanner.close();
    }

    public static void findPair(int[] arr, int targetSum) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            // Calculate the required complement
            int complement = targetSum - num;

            // If the complement is already in the set, we found our pair
            if (seenNumbers.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                found = true;
                // Remove the break statement if you want to find ALL pairs
                break; 
            }

            // Otherwise, add the current number to the set
            seenNumbers.add(num);
        }

        if (!found) {
            System.out.println("No pair found with the given sum.");
        }
    }
}
