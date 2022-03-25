package uz.arrays;
//max, min, avg.
import java.util.Scanner;

public class MaxMinMidle {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner num = new Scanner(System.in);
        int n=num.nextInt();
        double [] array= new double[n];
        for (int i=0; i<array.length; i++) {
            array[i]=Math.random();
        }
        double max=array[0];
        double min=array[0];
        double avg=0;
        for (int i=0; i<array.length; i++) {
            if (max<array[i]) {
                max=array[i];
            }
            if (min>array[i]) {
                min=array[i];
            }
            avg += array[i]/array.length;
        }
        System.out.println("max= " + max);
        System.out.println("min= " + min);
        System.out.println("avg= " + avg);
    }
}
