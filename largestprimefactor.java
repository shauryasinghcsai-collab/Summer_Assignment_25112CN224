import java.util.Scanner;
public class largestprimefactor {

    public static long findLargestPrimeFactor(long n) {
        long maxPrime = -1;
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }
        if (n > 2) {
            maxPrime = n;
        }

        return maxPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        long result = findLargestPrimeFactor(number);
        System.out.println("Largest Prime Factor: " + result);

        sc.close();
    }
}

