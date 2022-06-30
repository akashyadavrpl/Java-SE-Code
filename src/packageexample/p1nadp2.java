package packageexample;

import packageexample.p1.*;
import packageexample.p2.Student;;

public class p1nadp2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);

         p1.Student s2 = new p1.Student();

        System.out.println(s2.name);
    }
}
