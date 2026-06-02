import java.util.Scanner;

 public class table{
public static void main(String[] args) {
      Scanner scanner= new Scanner (System.in);
      System.out.println("enter a positive number  ,  ");
      int n =scanner.nextInt();
      for(int i=1;i<=10;i++){
        System.out.printf("%d * %d= %d*%n", n ,i,(n*i));

      }scanner.close();



    }
 }
    
 
