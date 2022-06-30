package packageexample.ex1package;

public class Num {
    private int num1;
    private int num2;

    public void add(int num1, int num2){
        System.out.println("Sum of number "+(num1+num2));
    }

    public void sub(int num1, int num2){
        System.out.println("Sub of number "+(num1-num2));
    }
}

 class UseNum{
    public static void main(String[] args) {
        Num n = new Num();
        n.add(12, 23);
    }
}
