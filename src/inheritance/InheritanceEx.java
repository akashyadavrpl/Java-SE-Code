package inheritance;

// import javax.security.sasl.Sasl;

class Employee{
    private String name;
    private double sal;

    public void setSal(double sal){
        this.sal = sal;
    }
    public void setName(String name){
        this.name = name;
    }
    public double sal(){
        return sal;
    }
}

class Manager extends Employee{
    private double bonus;

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public void totalSal(){
        System.out.println("Total sal is "+(this.sal()+bonus));
    }
}   

public class InheritanceEx {
    public static void main(String[] args) {
        
        Manager boss = new Manager();
        boss.setName("akashyadav");
        boss.setSal(45000.09);
        boss.setBonus(890.78);

        boss.totalSal();
        double sal = boss.sal();
        System.out.println("Sal is "+sal);

    }
}
