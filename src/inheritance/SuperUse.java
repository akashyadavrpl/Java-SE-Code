package inheritance;

class Circle{
    private int r;
    
    public Circle(int r){
        this.r = r;
    }

    public int getRadious(){
        return this.r;
    }

    public double getArea(){
        double area = Math.PI * r * r;
        return area;
    }

    public double getCircum(){
        double circ = 2 * Math.PI * r;
        return circ;
    }
}

class Cylender extends Circle{
    private int height;

    public Cylender(int r, int h){
        super(r);
        this.height = h;
    }

    public double getArea(){
        double area = 2 * super.getArea()+getCircum() * height;
        return area;
    }
}

public class SuperUse {
    public static void main(String[] args) {
        Cylender cy = new Cylender(3, 12);
        double cylender_area = cy.getArea();

        Circle ci = new Circle(45);
        double circle_area = ci.getArea();

        System.out.println("Cyclender area "+cylender_area);
        System.out.println("Circle ares "+circle_area);
    }
}
