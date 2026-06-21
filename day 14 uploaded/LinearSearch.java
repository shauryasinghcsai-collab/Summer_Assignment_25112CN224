import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size=sc.nextInt();
        System.out.println("Enter elements of Array");
        int [] arr = new int [size];
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();}

        System.out.println("Enter the element to be searched");
        int target =sc.nextInt();
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
            
        }
        return 0;
    }
}
    
