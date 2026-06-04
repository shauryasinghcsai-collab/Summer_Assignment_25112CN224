import java.util.Scanner;
public class primenumberinrange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the starting number");
        int start=sc.nextInt();

        System.out.println("enter the ending number");
        int end =sc.nextInt();
        System.out.println("prime number between " +start+ " and " +end+ "are");
        for (int i=start ;i<=end; i++){
            if( isPrime(i)){
                System.out.println(i+" ");

            }
        }
        sc.close();
    }
public static boolean isPrime(int num){
    if(num<=1){
        return false;
    }
    for(int i=2;i<=Math.sqrt(num);i++){
        if(num%i==0){
            return false;
        }
    }
     return true;
    }
}
    