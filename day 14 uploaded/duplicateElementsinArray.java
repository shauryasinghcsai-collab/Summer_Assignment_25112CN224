import java.util.HashSet;
import java.util.Scanner;


public class dublicateinArray {
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
    HashSet<Integer> seen = new HashSet<>();
    HashSet<Integer> duplicates = new HashSet<>();
    for( int num : arr){
        if (!seen.add(num)){
            duplicates.add(num);
        }
    }
    System.out.println("Duplicates elements " + duplicates);
    sc.close();
}
}
