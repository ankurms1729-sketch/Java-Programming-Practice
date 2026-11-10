//Read 5 numbers into an array and print them in the same order and in reverse order.
import java.util.Scanner;
public class Program16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.print("The numbers in the array are:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("The numbers in reverse order are:");
        for (int i=4; i>=0; i--)
{
            System.out.print(numbers[i] + " ");
        }

    }
}