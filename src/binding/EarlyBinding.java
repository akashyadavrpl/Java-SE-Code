package binding;

class A{

    //in compile time binding method show be static
    public static void show(){
        System.out.println("a is called");
    }
}

class B extends A{
    public static void show(){
        System.out.println("B is called");
    }

}

public class EarlyBinding {
    public static void main(String[] args) {
        A ref;
        ref = new A();
        ref.show();
        // Early binding
        ref = new B();
        ref.show();
    }
}
