import java.util.Scanner;

// Input currency in rupees and output in USD.

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Indian Rupees(RS): ");
        int rupees = sc.nextInt();

        sc.close();
        double dollar = rupees/82.43;

        System.out.println("Your amount in USD($) " + dollar);
    }
}
