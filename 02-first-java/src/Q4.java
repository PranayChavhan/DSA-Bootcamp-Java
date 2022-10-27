import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choise your action \n + - * / ");
        String action = sc.next();

        sc.close();

        if (action.equals("+")) {
            System.out.println("Sum of two number is " + num1 + num2);
        }else if(action.equals("-")){
            System.out.println("Substraction of two number is " + (num1 - num2));
        }else if(action.equals("*")){
            System.out.println("Multiplication of two number is " + (num1*num2));
        }else{
            System.out.println("Division of two number is " + ((num1/num2)));
        }
    }
}
