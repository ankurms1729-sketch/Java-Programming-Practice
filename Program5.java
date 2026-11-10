//Read the price and quantity of an item and print the total bill using printf with 2 decimal places.
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of item: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity of item: ");
        int quantity = sc.nextInt();

        double totalBill = price * quantity;

        System.out.printf("Total bill = %.2f", totalBill);
    }
}