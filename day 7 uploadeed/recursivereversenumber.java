import java.util.Scanner;
public class recursivereversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the original  number");
        int number=sc.nextInt();
        int reversed =reverse(number);
        System.out.println("original number: " + number);
        System.out.println("reversed number: " + reversed);
    }
    public static int reverse(int num){
        return reverseHelper(num,0);
    }
    private static int reverseHelper(int num,int reversedsofar){
        if(num==0){
            return reversedsofar;
        }
        int lastDigit=num%10;
        int updateReversed=(reversedsofar*10)+lastDigit;
        return reverseHelper(num/10, updateReversed);
    }
}
