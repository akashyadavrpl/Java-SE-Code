package infosys;

class Person{
    String name;
    byte age;

    void setPerson() {
        this.name = "Akash Yadav";
        this.age = 21;
    }
    void getPerson(){
        System.out.println("Name is: "+this.name);
        System.out.println("Age is: "+this.age);
    }
}

public class InfoClass{
    public static void main(String[] args) {
        Person akash = new Person();
        akash.setPerson();
        akash.getPerson();
    }
}

