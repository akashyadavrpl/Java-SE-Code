package looping;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

class ProgramsEx{
    public int digitSum(int num){
        int i, temp=0, lastdig=0;

        for(i=0; i<num;){
            lastdig = num%10;
            num /= 10;
            temp += lastdig;
        }
        return temp;
    }

    public int firstLastDig(int num){
        int temp, first=0, last=0, result;
        String firstlastsum;

        if(num<0 || num<10){
            first=0;
            last = num;
            firstlastsum = "0"+last;
            //MOST IMPORTENT
            result = Integer.valueOf(firstlastsum);
            return result;
        }else{
            last = num%10;
            while(num>0){
               num = num/10;
               if(num>0 && num<10){
                first = num;
                break;
               }
            }

            return (first+last);
        }
    }

    public int reverseNumber1(int num){
        int i, temp,result;
        String value="";
        while(num>0){
            temp = num%10;
            num = num/10;
            value += ""+temp;
        }
        result = Integer.parseInt(value);
        return result;
    }


}

public class Exirsise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a no: ");
        int num = sc.nextInt();

        ProgramsEx ex = new ProgramsEx();
        
        System.out.println("Digit sum is => "+ex.digitSum(num));
        System.out.println("First and last dig sum => "+ ex.firstLastDig(num));
        System.out.println("Reverse dig => "+ ex.reverseNumber1(num));
    }
}
