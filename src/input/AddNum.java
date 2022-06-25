package input;
import java.util.Scanner;
public class AddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum is: "+(num1+num2));
    }
    
}
