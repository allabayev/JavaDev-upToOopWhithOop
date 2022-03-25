package uz.arrays;
//Tub sonlarni topish
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter numbers n");
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        System.out.println("First solution primary numbers up to n");
        // FIRST SOLUTION
        for (int i=2; i<=num; i++) {
            boolean isPrime = true;
            for (int j=2; j<i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        // SECOND SOLUTION
        System.out.println("\nSecond solution primary numbers up to n");
        out_for:
        for (int i=2; i<=num; i++) {
            for (int j=2; j<i; j++) {
                if (i%j==0) {
                    continue out_for;
                }
            }
            System.out.print(i + " ");
        }
    }
}
