package oop;
import java.util.Scanner;

class UseWorker{
private int hw;
private double payRate;

public void setData(int hw, double payRate){
    this.hw = hw;
    this.payRate = payRate;
}

public void calculatesalery(){
     double sal;
    if(hw<=40){
        sal = hw*payRate;
        System.out.println("Your salery is "+sal);
    }else if(hw>40){
        sal = 2 * (hw*payRate);
        System.out.println("Normal pay "+(hw*payRate)+" but your sal is "+ sal);
    }else{
        System.out.println("Your sal is"+ 0);
    }
}
}

public class Worker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UseWorker workpay = new UseWorker();
        System.out.println("Enter hourse, payrate ");
        int hw = sc.nextInt();
        double payrate = sc.nextDouble();

        workpay.setData(hw, payrate);
        workpay.calculatesalery();
    }
}
