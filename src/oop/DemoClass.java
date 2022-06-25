package oop;

class DemoClassBlueprint{
    int roll;
    char grade;
    float per;

    public void showData(){
        System.out.println("Roll "+roll);
        System.out.println("Grade "+ grade);
        System.out.println("Persentage "+per);
    }
}

public class DemoClass {
    public static void main(String[] args) {
        DemoClassBlueprint obj = new DemoClassBlueprint();
        obj.showData();
    }
}
