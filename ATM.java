package HMS;
    import java.util.Scanner;

public class ATM {
    private static double balance = 1000.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;

        System.out.println("Welcome to the ATM!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    amount = scanner.nextDouble();
                    if (amount > 0) {
                        balance += amount;
                        System.out.println("Deposited $" + amount);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    amount = scanner.nextDouble();
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrew $" + amount);
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient funds.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}