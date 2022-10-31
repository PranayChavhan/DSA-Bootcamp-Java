import java.util.Scanner;

// Area Of Equilateral Triangle

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        System.out.println("<<<< Area Of Equilateral Triangle >>>>>");

        System.out.println("Enter side: ");
        double side = sc.nextDouble();

        sc.close();

        double area = (Math.sqrt(3)/4)*side*side;

        System.out.println("Area Of Equilateral Triangle is " + area);
    }
}
