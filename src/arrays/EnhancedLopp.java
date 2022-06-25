package arrays;
import java.util.Scanner;

public class EnhancedLopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {12,334,45,56767,2};

        System.out.println("Enter values in an arrays");
        for(int x : arr){
           System.out.println(arr + " "+x);
        }
    }
}
