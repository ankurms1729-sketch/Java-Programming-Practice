//Read a string and print its first character, last character, and the character at position 3.
import java.util.Scanner;
public class Program11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your String:");
        String str=sc.nextLine();
        System.out.println("First character = " + str.charAt(0));
        System.out.println("Last character = " + str.charAt(str.length() - 1));
        System.out.println("Character at position 3 = " + str.charAt(2));
    }
}