package S05.CHALLENGE_02;

public class Register {
    public static void main(String[] args) {
        PaymentMethod[] payments = new PaymentMethod[] {
            new CashPayment(150.0),
            new CardPayment(320.0, 500.0),
            new TransferPayment(1000.0, false) // Will fail authentication
        };

        for (PaymentMethod payment : payments) {
            if (payment.authenticate()) {
                System.out.println("✅ Authentication successful.");
                payment.processPayment();
                payment.showSummary();
            } else {
                System.out.println("❌ Authentication failed. Payment not authorized.");
            }
            System.out.println();
        }
    
    }
}
