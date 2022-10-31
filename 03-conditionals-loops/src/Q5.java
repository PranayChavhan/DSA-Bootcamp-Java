import java.util.Scanner;

// Area Of Parallelogram

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<<<<< Area Of Parallelogram >>>>>");

        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        System.out.println("Enter base: ");
        double base = sc.nextDouble();

        sc.close();

        double area = base*height;

        System.out.println("Area Of Parallelogram is " + area);
    }
}
