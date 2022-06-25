package looping;
import java.util.Scanner;

class FindPrimeNumber{

    public byte findPrime(byte num){

        int i, n=num/2;

        if(num == 0 || num == 1){
            System.out.println("Enter Heiger value");
        }else{
            for(i=2; i<=n;i++ ){
                if(num%i==0){
                    System.out.println("Number "+num+" is not a prime");
                    return (byte)num;
                }
            }
            System.out.println("Number "+num+" is prime");
            return (byte)num;
        }
return (byte)0;
    }

    public void normalPrimeFind(byte num){
        byte i;

        for(i=2; i<num; i++){
            if(num%i==0){
                break;
            }
        }
        if(i==num){
            System.out.println("Number "+num+" is prime");
        }else{
            System.out.println("Number "+num+" is not prime");
        }
    }
}

public class PrimeNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number: ");
        byte num = sc.nextByte();

        FindPrimeNumber p = new FindPrimeNumber();
        // p.findPrime(num);
        p.normalPrimeFind(num);
        System.out.println("Thank You");
    }
}
