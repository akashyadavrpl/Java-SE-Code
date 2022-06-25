package looping;
import java.util.Scanner;

public class SumIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 ;
        int num2 ;
        int finalsum=0;
        String choice;
        do{
            System.out.print("Enter 2 no: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("Pre Sum was => "+finalsum);
            finalsum = num1 + num2;
            System.out.println("New Sum => "+finalsum);
            System.out.print("again?? (Y/N) ");
            choice = sc.next();
            System.out.println();
        }while(choice.equalsIgnoreCase("Y"));

    }
}

