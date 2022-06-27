package keywords;

import java.nio.channels.Pipe;

class A{
    private static final double pie= Math.PI;

    public double showPie(){
        return pie;
    }
}

public class finalClass {
    public static void main(String[] args) {
        A ref = new A();

        System.out.println("Pie is "+ ref.showPie());
        
    }
}
