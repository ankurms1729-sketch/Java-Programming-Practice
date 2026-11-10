//Read a first name and a last name and print the full name and its initials, for example Ravi Kumar
import java.util.Scanner;
public class Program15 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter First Name: ");
String fname = sc.nextLine();
System.out.print("Enter Last Name: ");
String lname = sc.nextLine();
System.out.println("Full Name: " + fname + " " + lname);
System.out.println("Initials: " + fname.charAt(0) + lname.charAt(0));
    }
}
