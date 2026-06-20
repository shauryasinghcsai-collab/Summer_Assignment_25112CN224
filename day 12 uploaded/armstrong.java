import java.util.Scanner;
public class Armstrong {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int n =sc.nextInt();
        int r,sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(temp==sum)
            System.out.println("The number is an Armstrong number.");
        else
            System.out.println("The number is not an Armstrong number.");
        sc.close();
    }
}
