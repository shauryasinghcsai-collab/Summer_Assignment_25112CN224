import java.util.Scanner;
public class secondlargestelement {
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
        int largest =Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;

        for( int num : arr){
            if (num> largest){
                secondLargest = largest;
                largest =  num;
              }else if (num > secondLargest && num != largest){
                secondLargest = num;
              }

        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        sc.close();
    }
}
