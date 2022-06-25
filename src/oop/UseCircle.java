package oop;
import java.lang.*;
import java.util.function.DoubleUnaryOperator;
import java.util.Scanner;

 class Circle{
    
    private int radious;

    public void setRadious(int r){
        radious = r;
    }
    public void calculateArea(){
        Double area = Math.PI * Math.pow(radious, 2);
        System.out.println("Area of circle "+area);
    }
    public void calculateCircumFerance(){
        Double circum = 2*Math.PI*radious;
        System.out.println("Circum ferance "+circum);
    }
}

public class UseCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radious ");
        int r = sc.nextInt();

        Circle c = new Circle();
        c.setRadious(r);
        c.calculateArea();
        c.calculateCircumFerance();
    }
}
