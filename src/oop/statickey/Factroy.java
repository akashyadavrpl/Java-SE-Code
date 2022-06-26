package oop.statickey;

class UseFactroy{
    private int age;
    private char gender;
    // public String myname;

    private UseFactroy(int age, char gender){
        this.age = age;
        this.gender = gender;
    }
    
    static UseFactroy creatObject(int age, char gender){
        // quearoy
        
        if(age<19){
            return null;
        }else{
            UseFactroy obj = new UseFactroy(age, gender);
            return obj;
        }
    }
    public void show(){
        System.out.println("Age "+this.age+"\nGender "+this.gender);
    }
}

public class Factroy {
    public static void main(String[] args) {
        
        UseFactroy obj = UseFactroy.creatObject(21, 'M');
        obj.show();

        UseFactroy obj2 = UseFactroy.creatObject(67, 'F');
        obj2.show();

        // UseFactroy obj3 = new UseFactroy(34,'M');
    }
}
