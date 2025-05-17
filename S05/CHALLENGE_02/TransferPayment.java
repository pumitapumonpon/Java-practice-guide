package S05.CHALLENGE_02;

public class TransferPayment extends PaymentMethod {
    private boolean externalValidationSuccess;

    public TransferPayment(double amount, boolean externalValidationSuccess) {
        super(amount);
        this.externalValidationSuccess = externalValidationSuccess;
    }

    @Override
    public boolean authenticate() {
        return externalValidationSuccess;
    }

    @Override
    public void processPayment() {
        System.out.println("🏦 Processing bank transfer of $" + amount);
    }

}
