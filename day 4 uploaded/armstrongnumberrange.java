import java.util.Scanner;

public class ArmstrongNumbersInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range from the user
        System.out.print("Enter the lower bound of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        
        // Iterate through the range and check each number
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        // 0 and negative numbers are typically not considered Armstrong number
   if (num <= 0) {
            return false;
        }

        int originalNum = num;
        int sum = 0;
        
        // Step 1: Find the number of digits
        int digits = String.valueOf(num).length();

        // Step 2: Calculate the sum of digits raised to the power of 'digits'
        while (num > 0) {
            int remainder = num % 10;
            sum += Math.pow(remainder, digits);
            num /= 10;
        }

        // Step 3: Check if sum matches the original number
        return sum == originalNum;
    }
}


      
