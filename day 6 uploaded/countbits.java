import java.util.Scanner;
public class countsetbits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number" + " ");
        int number = sc.nextInt();
        int count = Integer.bitCount(number);
        
        System.out.println("Set bits in " + number + ": " + count);
        sc.close();
    }
}
    
    

