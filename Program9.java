//Read two numbers and swap them using a third variable. Print them before and after.
import java.util.Scanner;
public class Program9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter the first number:");
        a = sc.nextInt();
        System.out.print("Enter the second number:");
        b = sc.nextInt();

        System.out.println("----------------------------Before swapping----------------------------");
        System.out.println("First number: " + a + "  Second number: " + b);
        c = a; 
        a = b; 
        b = c;
        System.out.println("--------------------------------After swapping---------------------------");

        System.out.println("First number: " + a + "  Second number: " + b);

    }



}