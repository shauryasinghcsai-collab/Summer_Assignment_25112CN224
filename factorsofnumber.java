import java.util.Scanner;
public class factorsofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number" + " ");
        int number=sc.nextInt();
     System.out.print("The factors of  number is " + " ");
    for(int i=1;i<=number;i++){
    if( number% i==0){
     System.out.print(i  + " ");
    }
    }
    sc.close();
    }
    }
    

