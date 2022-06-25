package input;

public class CalculatorV {
    public static void main(String[] args) throws Exception{
        System.out.print("1st number: "); 
        byte num1 = (byte)System.in.read();

        System.out.print("2nd number: ");
        byte num2 = (byte)System.in.read();

        System.out.println("Sum is: "+ ((byte)num1 + (byte)num2));


    }
}
