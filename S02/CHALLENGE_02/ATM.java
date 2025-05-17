package S02.CHALLENGE_02;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var balance = 1000.0;
        int option;

        do {
            System.out.println("\n  --- Welcome to the ATM ---");
            System.out.println("1. Check balance ");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Current balance: $"+ balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("✅ Deposit successful. New balance: $"+ balance);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > balance) {
                        System.out.println("⚠️ Insufficient funds. Transaction canceled.");
                        continue; 
                    }
                    balance -= withdrawal;
                    System.out.println("✅ Withdrawal successful. New balance: $"+ balance);
                    break;
                case 4:
                    System.out.println("👋 Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid option. Please try again.");
                    break;
            }
        } while (option != 4);

        scanner.close();
    }
}
