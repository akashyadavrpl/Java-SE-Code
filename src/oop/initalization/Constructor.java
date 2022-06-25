package oop.initalization;

class PrintConstructor{
    private int id;
    private String name;
    private char gen;

    public PrintConstructor(){
        id=101;
        name="akash yadav";
        gen='M';
    }
    void show(){
        // System.out.println();
        System.out.println("Id "+id+"\nName "+name+"\nGender "+gen);

    }
}

public class Constructor {
    public static void main(String[] args) {
        PrintConstructor c = new PrintConstructor();
        c.show();
    }
}
