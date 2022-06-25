package arrays;
import java.util.Scanner;

public class RetangulorArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n*m ");
        byte n = sc.nextByte();
        byte m = sc.nextByte();
        int [][]arr = new int[n][m];
        int sumofarr = 0;
        // System.out.println("Enter array value");
        for(int i=0; i<n; i++){
            System.out.println("Enter in "+(i+1)+" row");
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextByte();
                sumofarr += arr[i][j];
            }
        }
        System.out.println("Sum is => "+sumofarr);
        System.out.println("Avg is => "+sumofarr/(n*m));
        System.out.println("\nArrys in matrix form ROW manner");
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nArrays in matrix from COLOUM manner");

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}
