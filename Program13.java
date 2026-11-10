//Read a string and print it in reverse using a loop.
import java.util.Scanner;
public class Program13{
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("The reverse of the string is: ");
		for(int i = str.length() - 1; i >= 0; i--){
			System.out.print(str.charAt(i));
		}
		System.out.println();
    }
}