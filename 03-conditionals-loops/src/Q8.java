import java.util.Scanner;

// Perimeter Of Circle

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<<<<< Perimeter Of Circle >>>>>");
        
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        sc.close();

        double parimeter = 2*Math.PI*radius;

        System.out.println("Perimeter Of Circle is " + parimeter);
    }
}
