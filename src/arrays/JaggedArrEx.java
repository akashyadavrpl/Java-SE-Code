package arrays;
import java.util.Scanner;

public class JaggedArrEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a row size: ");
        int n = sc.nextInt();
        int m=0;
        int sumofrow[] = new int[n];
        int [][]arr = new int[n][];

        for(int i=0; i<n; i++){
            System.out.print("Enter coloum size for "+(i)+"th colum ");
            m = sc.nextInt();
            System.out.println("Enter the values in colum");

            //
            arr[i] = new int[m];

            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
                sumofrow[i] += arr[i][j]; 
            }
        }
        // System.out.println("Length of arrys: "+ arr.length);
        System.out.println("\nValues in arry");

        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" sum is => "+ sumofrow[i]);
        }
        
    }
}
