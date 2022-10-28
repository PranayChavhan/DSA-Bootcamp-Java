import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();
        sc.close();

        int fnum = 0;
        for (int i = 1; i < num; i++) {
            i = i+i;

            System.out.print(fnum + " ,");

            i++;
        }
    }
}
