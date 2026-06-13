public class recursivefibonacci {

    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases: F(0) = 0, F(1) = 1
        if (n <= 1) {
            return n;
        }
        // Recursive step: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int terms = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.println(fibonacci(i) + " ");
        }
        scanner.close();
    }
}
    
    
