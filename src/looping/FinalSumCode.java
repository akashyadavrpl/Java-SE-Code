package looping;
import java.util.Scanner;

public class FinalSumCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, x2, xSum=0;
        String choice;
        do{
            System.out.print("Enter 2 no: ");
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            xSum += (x1+x2);
            System.out.print("Quit (Y/N)");
            choice = sc.next();
        }while(choice.equalsIgnoreCase("n"));

        System.out.println("Final sum is: "+xSum);
    }
}
