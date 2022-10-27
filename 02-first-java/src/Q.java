import java.util.Scanner;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class Q {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Principal amount: ");
            double principal = sc.nextDouble();

            System.out.print("Enter time: ");
            double time = sc.nextDouble();

            System.out.print("Enter interest rate: ");
            double rate = sc.nextDouble();

            sc.close();

            rate = rate/100;


            double finalAmount = principal*(1 + rate*time);

            System.out.println("Final Amount is " + finalAmount);

    }
}
