package binding;

class A{
    public A(){
        System.out.println("constructor a is called");
    }
    public void show(){
        System.out.println("show of a");
    }
}

class B extends A {
    public B(){
        super();
        System.out.println("constructor b is called");
    }
    public void show(){
        System.out.println("show of b");
    }
}

public class LateBinding {
    public static void main(String[] args) {
        A ref;

        ref = new B();
        ref.show();

        // ref = new A();
        
    }
}
