//Read two strings and print whether they are equal, ignoring case.
import java.util.Scanner;
public class Program12
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first string");
String s1 = sc.nextLine();
System.out.println("Enter the second string");
String s2 = sc.nextLine();
if(s1.equalsIgnoreCase(s2)) {
     System.out.println("The strings are equal");
     }
 else { 
System.out.println("The strings are not equal");}
}
}