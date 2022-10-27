import java.util.Scanner;

// Take 2 numbers as input and print the largest number.

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");

        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        sc.close();

        if (num1 > num2) {
            System.out.println(num1 + " is the largest number.");
        } else {
         System.out.println(num2 + " is the largest number.");   
        }


    }
}
