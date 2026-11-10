// Create an outer class for a real-world object (for example Order, BankAccount, or Hotel) with at least one private field.
// Write an inside it that reads and changes the private field. Create its object in main using the outer object.
// Write a inside it that works without an outer object (for example printing a receipt).
// Create one using an interface (for example Notifier) and pass it to a method of the outer class.
// Print the output from all three.


interface Notifier {

    void sendMessage();
}

class BankAccount {

    private double balance = 5000;


    class AccountDetails {

        void displayBalance() {

            System.out.println("Current Balance = " + balance);

            balance = balance + 2000;

            System.out.println("Updated Balance = " + balance);
        }
    }


    static class Receipt {

        void printReceipt() {

            System.out.println("Bank Receipt");
            System.out.println("Thank you for banking with us.");
        }
    }

    void sendNotification(Notifier n) {

        n.sendMessage();
    }
}

public class NestedClassDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount.AccountDetails details =
                account.new AccountDetails();

        System.out.println("Inner Class Output:");
        details.displayBalance();

        BankAccount.Receipt receipt =
                new BankAccount.Receipt();

        System.out.println("Static Nested Class Output:");
        receipt.printReceipt();

        Notifier notification = new Notifier() {

            public void sendMessage() {

                System.out.println("Notification sent successfully.");
            }
        };

        System.out.println("\nAnonymous Inner Class Output:");

        account.sendNotification(notification);
    }
}
