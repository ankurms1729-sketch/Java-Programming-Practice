//Read the radius of a circle (double) and print its area and circumference.

import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;

        System.out.println("Area of circle = " + area);
        System.out.println("Circumference of circle = " + circumference);
    }
}
