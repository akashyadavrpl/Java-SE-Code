package input;

public class SystemInput {
    public static void main(String[] args) throws Exception {
     
        System.out.println("Enter your gender F/M ? ");
        char gender = (char)System.in.read();
        System.out.println("Gender is: "+gender);
    }
    
}
