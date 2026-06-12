import java.util.Scanner;
public class findpower {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the base number
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        // Prompt user for the exponent
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Initialize result to 1
        double result = 1.0;

        // Convert exponent to a positive number for iteration loop
        int absoluteExponent = Math.abs(exponent);

        // Multiply the base repeatedly using a loop
        for (int i = 1; i <= absoluteExponent; i++) {
            result *= base;
        }
      // If the original exponent was negative, take the reciprocal
        if (exponent < 0) {
            result = 1.0 / result;
        }

        // Display the final calculation
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner resource
        scanner.close();
    }
}
