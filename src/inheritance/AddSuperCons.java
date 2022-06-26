package inheritance;

class Num{
    private int x;
    private int y;

    public Num(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}

class AddNum extends Num{
    private int sum;

    public AddNum(int x, int y){
        super(x, y);
        
    }

    public void sum(){
        System.out.println("Sum "+(super.getX()+super.getY()));
    }
}

public class AddSuperCons {
    public static void main(String[] args) {
        AddNum addiction1 = new AddNum(12, 23);

        addiction1.sum();

        AddNum addiction2 = new AddNum(342, 234);
        addiction2.sum();
    }
}
