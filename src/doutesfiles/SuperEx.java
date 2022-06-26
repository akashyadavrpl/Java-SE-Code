package doutesfiles;

class Employee{
    private double sal;

    public void setSal(double sal){
        this.sal = sal;
    }

    public double getSal(){
        return sal;
    }
}

class Manager extends Employee{
    private double bonus;

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getSal(){
        double total_sal = super.getSal()+bonus;
        System.out.println("Total sal is "+total_sal);
        return total_sal;
    }
}


public class SuperEx {
    public static void main(String[] args) {
        Manager boss = new Manager();
        
       boss.setSal(2000.89);
       boss.setBonus(789.78);
       boss.getSal();
        
        
    }
}
