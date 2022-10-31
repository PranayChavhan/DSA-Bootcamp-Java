import java.util.Scanner;

// Perimeter Of Equilateral Triangle

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<<<< Perimeter Of Equilateral Triangle >>>>");

        System.out.println("Enter side: ");
        double side = sc.nextDouble();
        sc.close();

        double perimeter = 3*side;

        System.out.println("Perimeter Of Equilateral Triangle is " + perimeter);
    }
}
