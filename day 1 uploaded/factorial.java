import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int i, fact =1;
        System.out.println("enter a positive number " );
        int num =sc.nextInt();
        for(int i1=1;i1<=num;i1++)
        {
            fact=fact*i1;
        }
        System.out.println("the factorial of" + num +  "is " +fact);
        sc.close();
    }
}
