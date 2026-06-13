import java.util.Scanner;

public class SumOfDigitsRecursive {

    // Recursive method to find sum of digits
    public static int sumDigits(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = sumDigits(number);

        System.out.println("Sum of digits: " + result);
        sc.close();
    }
}
