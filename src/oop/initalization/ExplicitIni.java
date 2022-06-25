package oop.initalization;

class Ini{
    private int id = 101;
    private String name = "akash yadav";
    private char gen = 'M';

    public void showData(){
        System.out.println("Id "+id+"\nName "+name+"\nGender "+gen);
    }
}

public class ExplicitIni {
    public static void main(String[] args) {
        Ini iniObj = new Ini();

    iniObj.showData();
    }
}
