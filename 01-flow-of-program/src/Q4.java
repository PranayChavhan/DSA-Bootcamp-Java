import java.util.Scanner;

// Take 2 numbers as inputs and find their HCF and LCM.

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        
        sc.close();
        int i = 2;
        while (true) {
            if (num1 % i == 0 && num2 % i ==0) {
                System.out.println(i);
                break;
            }else{
                i++;
            }
        }

        int j = 2;
        while (true) {
            if (j/num1 == 1 && j/num2 == 1) {
                System.out.println(i);
                break;
            }else{
                j++;
            }
        }
        

    }
}