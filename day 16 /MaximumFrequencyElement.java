import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxFrequencyElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get array size from user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // 2. Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Find the maximum frequency element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        int maxElement = arr[0];
        int maxCount = 0;

        for (int num : arr) {
            // Get current count of 'num', default to 0, and add 1
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);

            // Keep track of the highest frequency on the fly
            if (count > maxCount) {
                maxCount = count;
                maxElement = num;
            }
        }

        // 4. Print the result
        System.out.println("---");
        System.out.println("Element with maximum frequency: " + maxElement);
        System.out.println("It appeared " + maxCount + " times.");

        scanner.close();
    }
}

