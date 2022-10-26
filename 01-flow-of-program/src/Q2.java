import java.util.Scanner;

// Take two numbers and print the sum of both.

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        sc.close();

        int result = addNumber(num1, num2);

        System.out.println("Sum is : " + result);

    }

    static int addNumber (int a, int b) {
        return a + b;
    }
}
