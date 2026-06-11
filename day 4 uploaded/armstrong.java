import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(isArmstrong(num)){
            System.out.println(num+"is an armstrong number");
        }else{
            System.out.println(num+"is not any armstrong number");
        }
        sc.close();
        }
    public static boolean isArmstrong(int num){
        int originalNum=num;
        int sum=0;
    int digits = String.valueOf(num).length();
    while(num>0){
       int lastDigit = num % 10; 
            sum += Math.pow(lastDigit, digits); 
            num = num / 10; 
    }
    return sum == originalNum;
    }
    }
    
