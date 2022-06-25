package oop;

import java.sql.Ref;

class PrintIncrement{
    private int x;
    private int y;

    public PrintIncrement(){
        x=10;
        y=20;
    }
    public void increment(PrintIncrement Ref){
        Ref.x++;
        Ref.y++;
    }

   public void show(){
        System.out.println("X "+x+"\nY "+y);
    }
}

public class Increment {
    public static void main(String[] args) {
        PrintIncrement pi = new PrintIncrement();

        pi.show();
        pi.increment(pi);
        System.out.println("after incrementing");
        pi.show();
    }
}
