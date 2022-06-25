package oop;

// import java.sql.Ref;

class AssgnClass{
    private int x, y;

    public AssgnClass(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void swapNumber(AssgnClass Ref){
        int t = Ref.x;
        Ref.x = Ref.y;
        Ref.y = t;
    }
    public void show(){
        System.out.println("X "+x+"\nY "+y);
    }
    public void modifyValue( AssgnClass Ref,int x, int y){
        Ref.x = x;
        Ref.y = y;
    }
}

public class Assgn {
    public static void main(String[] args) {
        AssgnClass obj = new AssgnClass(10, 20);

        obj.show();
        obj.swapNumber(obj);
        System.out.println("After swaping");
        obj.show();
        obj.modifyValue(obj, 23, 45);
        System.out.println("after modifying value");
        obj.show();
        obj.swapNumber(obj);
        System.out.println("after swping");
        obj.show();
        
    }
}
