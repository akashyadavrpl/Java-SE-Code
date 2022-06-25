package looping;
import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fact = 1;
        System.out.print("Enter number ");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("Number should be positive");
        }else{
            if(num == 0){
                System.out.println("Factorial is "+ fact);
            }else{
                while(num>1){
                    fact = fact * num;
                    num --;
                }
                System.out.println("Factorial is: "+fact);
            }
        }
        System.out.println("Thank you!");
    }
}
