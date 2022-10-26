import java.util.Scanner;

// Input a year and find whether it is a leap year or not.

public class Q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the year: ");
    int year = sc.nextInt();

    sc.close();

    if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is not a leap year");
    }
  }
}
