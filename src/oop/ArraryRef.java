package oop;

class ArraryRefClass{
    public int[] createarrays(int n){
        int brr[] = new int[n];
        return brr;
    }
}
//Returning arrsy refrences

public class ArraryRef {
    public static void main(String[] args) {
        ArraryRefClass ar = new ArraryRefClass();
        int []arr = ar.createarrays(7);

        System.out.println("Length of arrys is "+arr.length);
    }
}
