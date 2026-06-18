import java.util.Scanner;
public class repeatedcharectorpatter {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        char ch='A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " "); ;
            }
            ch++;
            System.out.println();
        }
        scanner.close();
    }
    
}
