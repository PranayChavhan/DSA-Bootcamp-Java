import java.util.Scanner;

// Area Of Triangle

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<<<<<<< Area Of Triangle >>>>>>>");

        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth = sc.nextDouble();

        sc.close();

        double area = (height*breadth) / 2;

        System.out.println("Area of triangle is: " + area);

    }
}
