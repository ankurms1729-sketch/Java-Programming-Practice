//Read the marks of 3 subjects and print the total and the average.
import java.util.Scanner;
public class Program7 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int total,avg = 0;
System.out.print("Enter the marks of 1 subjects:");
int mark1 = sc.nextInt();
System.out.print("Enter the marks of 2 subjects:");
int mark2 = sc.nextInt();
System.out.print("Enter the marks of 3 subjects:");
int mark3 = sc.nextInt();
total = mark1 + mark2 + mark3;
avg = total / 3;
System.out.println("The total marks are " + total);
System.out.println("The average marks are " + avg);
    }
}