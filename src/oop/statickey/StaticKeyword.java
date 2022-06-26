package oop.statickey;

class StaticClass {
    static int roll;

    public static void show() {
        System.out.println("rOLL "+roll);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        StaticClass.roll=90;
        System.out.println("Roll "+StaticClass.roll);
        StaticClass.show();
    }
}
