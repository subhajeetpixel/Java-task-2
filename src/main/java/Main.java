import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. New balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. New balance: " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + balance);
                    break;
                case 4:
                    System.out.println("Exiting program. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}