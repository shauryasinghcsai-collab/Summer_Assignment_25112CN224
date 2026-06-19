import java.util.Scanner;
public class Twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner pc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = pc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of entered two number is " + sum);
        sc.close();
        pc.close();
    }
}
