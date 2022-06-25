package oop;
import java.util.Scanner;

class ArraysSearch{

    public int[] searchArrays(int n, int []arr){

        int []newarr = {0,0,0,0,0,0};
        int inc = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                newarr[inc] = i;
                inc++;
            }
        }
        newarr[5] = inc;
        return newarr;
    }

    public int[] count(int []arr, int n){
        int grater=0, smaller=0, equal=0;

        for(int i=0; i<arr.length; i++){

            if(n==arr[i]){
                equal++;
            }else if(arr[i]>n){
                grater++;
            }else{
                smaller++;
            }
        }
        int []newarr = {equal, grater, smaller};
        return newarr;
    }

}

public class ArrayOccure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []myarr = new int[10];
        System.out.println("Enter values in arrays");

        for(int i=0; i < myarr.length; i++){
            myarr[i] = sc.nextInt();
        }
        // sc.nextLine();
        ArraysSearch as = new ArraysSearch();
        System.out.println("Enter no which has to be searched");
        int n = sc.nextInt();
        int []ansarr = as.searchArrays(n, myarr);

        // System.out.println("Length os arr "+ansarr.length);

        System.out.println("Given value present at indexes");

        for(int i=0; i<ansarr[5]; i++){
            System.out.print(ansarr[i]+" ");
        }
        int counarr[] = as.count(myarr, n);
        System.out.println("\nEquals no => "+counarr[0]+"\nGrater no => "+counarr[1]+"\nSmaller no => "+counarr[2]);
    }
}
