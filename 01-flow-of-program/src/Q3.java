import java.util.Scanner;

// Take a number as input and print the multiplication table for it.

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int num = sc.nextInt();

        sc.close();
        for (int i = 1; i <= 10; i++) {
           System.out.println(num*i); 
        }
    }
}
