package oop.statickey;

import java.util.Scanner;

class UseStaticBlock {
    private int accountid;
    private String name;
    private double balance;

    private static double rate_of_intrest;

    static {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rate of intrest ");
        rate_of_intrest = sc.nextDouble();

    }

    public UseStaticBlock(int accountid, String name, double balance) {
        this.accountid = accountid;
        this.name = name;
        this.balance = balance;
    }

    private double totalBalence(double balance) {
        return balance * rate_of_intrest;
    }

    public void afterSomeTime() {
        this.balance = totalBalence(this.balance);
    }

    public void show() {
        System.out.println("Account ID " + this.accountid + "\nName " + this.name + "\nBalence " + this.balance
                + "\nR O I " + rate_of_intrest);

    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter AccountId, name, balence ");
        int accountid = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double balance = sc.nextDouble();

        UseStaticBlock f1 = new UseStaticBlock(accountid, name, balance);
        System.out.println("*****************************");
        f1.show();
        f1.afterSomeTime();
        System.out.println("*****************************");
        f1.show();
        System.out.println("*****************************");
        UseStaticBlock f2 = new UseStaticBlock(102, "himanshu", 2356);
        f2.show();
        System.out.println("*****************************");
        f2.afterSomeTime();
        f2.show();
    }
}
