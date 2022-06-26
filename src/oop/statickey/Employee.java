package oop.statickey;

class EmployeeClass{
    int ID;
    String name;
    int age;
    private static int nextID=101;

    public EmployeeClass(String name, int age){
        this.ID = nextID++;
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("ID "+this.ID+"\nName "+this.name+"\nAge "+this.age);
    }
    public int nextID(){
        System.out.println("Next ID will be "+(++ID));
        return ID;
    }
}

public class Employee {
    public static void main(String[] args) {
        
        EmployeeClass ec = new EmployeeClass("Akash Yadav", 21);
        ec.show();
        ec.nextID();
        EmployeeClass a1 = new EmployeeClass("Himanshu", 22);
        EmployeeClass a2 = new EmployeeClass("Arvind", 23);
        a1.show();
        a2.show();
    }
}
