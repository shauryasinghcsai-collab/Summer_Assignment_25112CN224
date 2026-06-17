import java.util.Scanner;
public class charectortriangle {
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int number = sc.nextInt();
        char ch = 'A';
            for (int i = 1; i <=number; i++) {
                 for (int j = 1; j <=i; j++){
                    System.out.print(ch + " ");
                   
                }
                 ch++;
                System.out.println();
            }
        sc.close();
    }
}
