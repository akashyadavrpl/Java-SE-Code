package arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        // int arr[];
        // arr = new int[10];
        // int brr[] = new int[10];
        // String []crr = new String[3];
        
        // System.out.println(crr[2]);

        // System.out.println(arr[7]);
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array: ");
        byte n = sc.nextByte();
        int []arr = new int[n];
        int sumofarray = 0;

        System.out.println("Enter values in an arrays");
        for(byte i=0; i<n;i++){
            arr[i] = sc.nextByte();
            sumofarray += arr[i];
        }
        System.out.println("Sum of arrays is => "+sumofarray);
        System.out.println("avrage of arrays => "+(sumofarray/n));
    }
}
