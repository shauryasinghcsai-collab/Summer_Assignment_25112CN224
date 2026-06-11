import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        int gcd=findGCD(num1,num2);
        System.out.println("theGCD of "+ num1 +" and "+ num2 +" is " + gcd);
        sc.close();
    }
    public static int findGCD(int a,int b){
        if (b==0){
            return a;
        }
        return findGCD(b,a%b);
    }
}
