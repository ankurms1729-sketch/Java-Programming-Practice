//Read two integers and print their sum, difference, product, and quotient.

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));

        if (b != 0) {
            System.out.println("Quotient = " + (a / (double)b));
        } else {
            System.out.println("Division by zero is not possible.");
        }

    }
}
