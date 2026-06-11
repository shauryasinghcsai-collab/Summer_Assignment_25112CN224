import java.util.Scanner;
    public class BinartoDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter binary number only");
        long binary =sc.nextLong();
        int decimal = 0;
        int power = 0;

        while (binary != 0) {
            long lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            
            binary = binary / 10;
        }

        System.out.println("Decimal value: " + decimal); 
        sc.close();
    }
}
    
