package oop.statickey;

public class StaticMethod {
    public static void main(String[] args) {

        StaticMethodM obj = new StaticMethodM();

        obj.show(21, "akash");
        
        StaticMethodM.show(34, "Himanshu");
    }

}

class StaticMethodM{
    private int password;

    public static void show(int age, String name){
        System.out.println("Name "+name+"\nAge "+age);
    }
}