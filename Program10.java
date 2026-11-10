//Read a string and print its length, uppercase form, and lowercase form.
import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your String:");
        String str=sc.nextLine();
        System.out.println("String length = " + str.length());
        System.out.println("String in uppercase = " + str.toUpperCase());
        System.out.println("String in lowercase = " + str.toLowerCase());
    }
}