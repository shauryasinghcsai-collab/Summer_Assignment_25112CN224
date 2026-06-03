import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
    System.out.println("enter a number");
    int number=sc.nextInt();
    int reverseNumber = 0;
    while(number!=0){
        int lastdigit=number%10;
        reverseNumber=reverseNumber*10+lastdigit;
        number=number/10;
    }
    System.out.println("  ReverseNumber  " + reverseNumber);

    sc.close();
    }
}
