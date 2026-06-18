import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(scanner.in);
        
        System.out.print("Enter the side length of the square: ");
        int size = scanner.nextInt();
        
        // Outer loop for rows
        for (int i = 1; i <= size; i++) {
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {
                // Print '*' for the borders, otherwise print a space
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces to match the "* " width
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
        
        scanner.close();
    }
}
