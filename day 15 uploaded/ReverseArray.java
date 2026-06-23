import java.util.Scanner;
public class reverseArray {
    public static void reverse(int [] arr){
    int start =0;
    int end = arr.length-1;
    while (start< end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println(" Enter size of Array");
        int size = sc.nextInt();
        if(size<2){
            System.out.println("Array must contain atleast two elemenst");
            sc.close();
            return;
        }
        int [] arr = new int[size];
         System.out.println( "Enter " + size + " Elements: ");
        for(int i =0; i<size ; i++){
            arr[i]=sc.nextInt();
    }
    reverse(arr);
    System.out.println(java.util.Arrays.toString(arr));
    sc.close();
}
}
