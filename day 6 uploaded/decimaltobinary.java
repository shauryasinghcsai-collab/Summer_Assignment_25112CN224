import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        if (!sc.hasNextLong()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        long n = sc.nextLong();
        sc.close();
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }
        if (n == 0) {
            System.out.println("Binary: 0");
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        System.out.println("Binary: " + sb.reverse().toString());
    }
}
