import java.util.Scanner;

// Area Of Circle Java Program

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(">>>Fint The Area Of Circle<<<");

        System.out.print("Enter the radius: ");

        double r = sc.nextDouble();
        sc.close();
        double area = Math.PI*r*r;

        System.out.println("Area is: " + area);
    }
}
