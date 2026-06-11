import java.util.Scanner;
public class strongnumber {
   public static  int getFactorial(int number){
    int factorial=1;
    for(int i=1;i<=number;i++){
      factorial*=i;
    }
      return factorial;
    }
   
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();
        
        int temp = number;
        int sum = 0;

       while(temp>0){
         int digit =temp%10;
         sum+=getFactorial(digit);
         temp/=10;
       }

       if (sum==number){
         System.out.println("Number is strong number");
       } else{
         System.out.println("number is not strong number");
       }
       sc.close();
   }
   }
