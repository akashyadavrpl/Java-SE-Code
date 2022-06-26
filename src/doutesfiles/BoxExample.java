package doutesfiles;

class Box{
    private int l, b, h;

    public Box(){
        l=b=h=0;
    }
    public Box(int l, int b, int h){
        this.l = l;
        this.b=b;
        this.h = h;
    }
    public Box(int s){
        l=b=h = s;
    }
    public Box(Box b){
        this.l = b.l;
        this.b = b.h;
        this.h = b.b;
    }
    public void show(){
        System.out.println("L "+this.l+"\nH "+this.h+"\nB "+this.b);
    }
}

class BoxWeight extends Box{
    private int we;

    public BoxWeight(){
        this.we = 0;
    }
    public BoxWeight(int l, int b, int h, int we){
        this.we = we;
    }
    public BoxWeight(BoxWeight p){
        
    }

}

public class BoxExample {
    public static void main(String[] args) {
        BoxWeight bw = new BoxWeight();
        bw.show();
    }
}
