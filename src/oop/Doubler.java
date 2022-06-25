package oop;

class DoublerClass{
    public void doubleArray(int []brr){
        for(int i=0; i<brr.length; i++){
            brr[i] = brr[i]*2;
        }
    }
}
// passing arrays ref
public class Doubler {
    public static void main(String[] args) {
        int arr[] = {12,23,34,32,21};

        DoublerClass d = new DoublerClass();
        for(int x: arr){
            System.out.println(x);
        }
        System.out.println("After double");
        d.doubleArray(arr);
        for(int x: arr){
            System.out.println(x);
        }
    }
}
