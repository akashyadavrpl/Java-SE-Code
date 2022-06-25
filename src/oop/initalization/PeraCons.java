package oop.initalization;
import java.util.Scanner;

class Circle{
    private int r;

    public Circle(int r){
        this.r = r;
    }
    public void calculateArea(){
        double area = Math.PI*Math.pow(r, 2);
        System.out.println("Area is "+area);
    }
    public void circumFerence(){
        double circum = (Math.PI*r)*2;
        System.out.println("CircumFerence is "+circum);
    }
}

public class PeraCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radious ");
        int r = sc.nextInt();

        Circle c = new Circle(r);
        c.calculateArea();
        c.circumFerence();
    }
}
