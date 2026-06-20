import java.util.Scanner;
public class perfectnumber {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if it is a perfect number:");
        int n =sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n)
            System.out.println("The number is a perfect number.");
        else
            System.out.println("The number is not a perfect number.");
        sc.close();
    }
}
