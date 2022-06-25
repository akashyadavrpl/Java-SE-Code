package oop;

import java.util.Scanner;

class PerametrizedClassPrint {
    private int roll;
    private String name;
    private Float per;

    public void setData(int r, String n, Float p) {
        roll = r;
        name = n;
        per = p;
    }

    public void showData() {
        System.out.println("Roll " + roll + "\nName " + name + "\nPer " + per);
    }
}

public class PerametrizedClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PerametrizedClassPrint obj = new PerametrizedClassPrint();
        System.out.println("Enter roll, name, per");
        int roll = sc.nextInt();
        // sc.nextLine();
        // String name = sc.next();
        String name = sc.nextLine();
        sc.nextLine();
        Float per = sc.nextFloat();

        obj.setData(roll, name, per);
        obj.showData();
    }

}
