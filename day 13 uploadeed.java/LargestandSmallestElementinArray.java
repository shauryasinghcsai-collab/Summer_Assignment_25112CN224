import java.util.Scanner;
public class LargestandSmallest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size =sc.nextInt();
        System.out.println("Enter the elements of array");
        int [] arr = new int[size];
        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        int Max=0; int Min=arr[0];
        for(int i=0; i<size;i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + Max);
        for(int i=0; i<size;i++){
            if(arr[i]<Min){
                Min=arr[i];
            }
        }
        System.out.println("Smallest element in the array is: " + Min);
        sc.close();
    }
}
