
package input;
import java.util.Scanner;

public class InputName {

    public static void main(String[] args) {
        // String name, fullname;
        // System.out.print("Full Name: ");

        // Scanner kb = new Scanner(System.in);
        // fullname = kb.nextLine();
        // System.out.print("Single Name: ");
        // name = kb.next();

        // System.out.println("Single Name: "+name);
        // System.out.println("Full Name is: "+fullname);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Age is: "+age);


    }
    
}
