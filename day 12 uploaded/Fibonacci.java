import java.util.Scanner;
public class fibonacci {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci sequence:");
        int n =sc.nextInt();
        int firstterm=0,secondterm=1,thirdterm=0;
        System.out.print("Fibonacci sequence: ");
        for(int i=1;i<=n;i++){
            System.out.print(firstterm+" ");
            thirdterm=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=thirdterm;
        }
        sc.close();
    }
}
