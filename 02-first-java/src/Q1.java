import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int num = sc.nextInt();

        sc.close();
        if (num%2 == 0) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is odd number.");
        }
    }
}
