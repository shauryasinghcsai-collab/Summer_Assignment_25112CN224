import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        int lcm = findLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (Math.abs(a) / findGCD(a, b)) * Math.abs(b);
    }
}