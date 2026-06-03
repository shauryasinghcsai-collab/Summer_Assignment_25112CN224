import java.util.Scanner;

public class sumofdigit{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter a number");
    int number=sc.nextInt();
    int originalNumber = number;
    int sum=0;
    number =Math.abs(number);
    while(number>0){
        int lastdigit=number%10;
        sum+=lastdigit;
        number=number/10;
    }
     System.out.println("the sum of digit of  " + originalNumber + " is "  +  sum);
  
    sc.close();
}
}
