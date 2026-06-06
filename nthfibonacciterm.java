import java.util.Scanner;

public class nthfibonacciterm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println("The " + n + "th Fibonacci number is: " + (n));
        sc.close();
    }
    public static long nthfibonacciterm(int n){
    if(n<=0) return 0;
    if(n==1) return 1;

    long first =0;
    long second=1;
    long nthTerm=0;

    for (int i=2; i<=n;i++){
        nthTerm=first+second;
        first=second;
        second=nthTerm;
    }

    return nthTerm;
    }
}
