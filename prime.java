import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number to be checked");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("number is not prime");
        } else{
            System.out.println("number is prime");
        }
        sc.close();
    }
}
