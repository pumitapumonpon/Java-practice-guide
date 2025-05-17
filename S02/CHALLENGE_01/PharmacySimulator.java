package S02.CHALLENGE_01;

import java.util.Scanner;

public class PharmacySimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Medicine name: ");
        String nameMedication = scanner.nextLine();

        System.out.print("Unit price: ");
        double price = scanner.nextDouble();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        
        var totalWithoutDiscount = price * quantity;

        var hasDiscount = totalWithoutDiscount > 500;
        double discount = hasDiscount ? totalWithoutDiscount * 0.15 : 0;
        double totalToPay = totalWithoutDiscount - discount;


        // Print summary
        System.out.println("\n  --- Purchase Summary ---");
        System.out.println("Medicine: " + nameMedication);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit price: $" + price);
        System.out.println("Total without discount: $" + totalWithoutDiscount);
        System.out.println("Discount applied?: " + hasDiscount);
        System.out.println("Discount: $" + discount);
        System.out.println("Total to pay: $" + totalToPay);

        scanner.close();
    }
}
