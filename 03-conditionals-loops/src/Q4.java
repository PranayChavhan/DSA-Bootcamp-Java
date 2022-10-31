import java.util.Scanner;

// Area Of Isosceles Triangle

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<<<<< Area Of Isosceles Triangle >>>>>");

        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("Enter base: ");
        double base = sc.nextDouble();

        sc.close();
        double area = (base*height)/2;

        System.out.println("Area Of Isosceles Triangle is " + area);
    }
}
