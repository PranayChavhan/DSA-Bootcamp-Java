import java.util.Scanner;

// Take name as input and print a greeting message for that particular name.

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you name: ");

        String name = sc.nextLine();

        sc.close();

        System.out.println("Good afternoon " + name);
    }
}
