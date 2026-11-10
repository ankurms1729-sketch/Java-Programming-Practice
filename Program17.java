//Read n numbers into an array and print their sum and average.
import java.util.Scanner;
public class Program17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / n;
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);
    }
}