package uz.arrays;
//Sartirovka qilish.
import java.util.Scanner;

public class Sortr {
    public static void main(String[] args) {
        System.out.println("Enter a number to sort");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        double [] array= new double[n];
        for (int i=0; i< array.length; i++) {
            array[i]=Math.random()*100;
        }
        for (int i=0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
        double reserf;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j< array.length; j++) {
                if (array[j]>array[i]) {
                    reserf=array[j];
                    array[j]=array[i];
                    array[i]=reserf;
                }
            }
        }
        for (int i=0; i< args.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
