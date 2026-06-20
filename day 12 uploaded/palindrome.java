import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        int n =sc.nextInt();
        int r,sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome.");
        sc.close();
    }
}
