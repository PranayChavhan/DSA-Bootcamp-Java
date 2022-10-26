import java.util.Scanner;

// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("Enter Numbers: ");
            int a = sc.nextInt();
            if (a == 5) {
                
                System.out.println(sum);
                break;
            }
            sum = sum + a;
            System.out.println(a); 
        }
        sc.close();        
    }
}
