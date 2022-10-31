import java.util.Scanner;

// Perimeter Of Parallelogram


public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<<< Perimeter Of Parallelogram >>>");

        System.out.println("Enter side: ");
        double side = sc.nextDouble();

        System.out.println("Enter base: ");
        double base = sc.nextDouble();

        sc.close();

        double perimeter = 2*(base+side);

        System.out.println(perimeter);
    }
}
