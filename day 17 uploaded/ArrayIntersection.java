import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class ArrayIntersection{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the elementof  array");
        int size1 =sc.nextInt();
         int [] arr1 = new int[size1];
         System.out.println("enter  " +size1+ " elements: ");
        for (int i =0; i<size1; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the element of  array");
        int size2 =sc.nextInt();
         int [] arr2 = new int[size1];
         System.out.println("enter  " +size2+ " elements: ");
        for (int i =0; i<size2; i++){
            arr2[i]=sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }
        for( int num : arr2){
            if(set.contains(num)){
                intersectionSet.add(num);
            }
        }
        System.out.println("\nFirst Array: " + Arrays.toString(arr1));
        System.out.println("Second Array: " + Arrays.toString(arr2));
        System.out.println("Intersection: " + intersectionSet);
        sc.close();
    }
}
