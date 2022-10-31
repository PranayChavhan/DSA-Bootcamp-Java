import java.util.Scanner;

// Area Of Rectangle Program

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<<<<< Area of Rectangle >>>>>");

        System.out.println("Enter length: ");
        double length = sc.nextDouble();

        System.out.println("Enter width: ");
        double width = sc.nextDouble();

        sc.close();

        double area = length*width;

        System.out.println("Areat of rectangle is " + area);
    }
}
