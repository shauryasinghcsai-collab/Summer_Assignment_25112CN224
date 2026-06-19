import java.util.Scanner;
public class reversepyramidnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for the pyramid:");
        int rows =sc.nextInt();
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
                }
                int j;
                for(j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                for(j=i-1;j>=1;j--){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        
        sc.close();
    }
}
