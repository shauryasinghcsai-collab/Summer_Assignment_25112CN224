 import java.util.Scanner;
public class FrequencyofElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int visited[] = new int[n];
        int counted =-1;
        System.out.println("Enter "+ n + " elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         for ( int i=0;i<n;i++){
            if(visited[i] == counted){
                continue;
            }
            int count =1;
            for( int j =i+1; j<n;j++){
                if(arr[i] == arr[j]){
                count++;
                visited[j] = counted;
            }
         }
         System.out.println(arr [i]+ " occurs " + count + " times ");
         }
    }
    
    
}
