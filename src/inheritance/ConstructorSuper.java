package inheritance;

class A{
    public A(){
        System.out.println("Const a called");
    }
}
class B extends A{
    public B(){
        System.out.println("Const b called");
    }
}

public class ConstructorSuper {
    public static void main(String[] args) {
        B obj = new B();
    }
}
