import java.util.Scanner;

// Area Of Rhombus

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<<<<< Area Of Rhombus >>>>>");

        System.out.println("Enter digonal1: ");
        double d1 = sc.nextDouble();
        System.out.println("Enter digonal2: ");
        double d2 = sc.nextDouble();

        sc.close();

        double  area = (d1*d2)/2;

        System.out.println("Area Of Rhombus is " + area);
    }
}
