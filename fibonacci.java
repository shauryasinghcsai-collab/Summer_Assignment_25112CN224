import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the numbers of series");
    int n= sc.nextInt();
    
    int firstterm=0;
    int secondterm=1;
    System.out.println("the fibonacci series are "+ " ");
    for(int i=1;i<=n;i++){
    System.out.println(firstterm+" ");
        int nextterm=firstterm+secondterm;
        firstterm=secondterm;
        secondterm=nextterm;

    }
    sc.close();
    }
}

