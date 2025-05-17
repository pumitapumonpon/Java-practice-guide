package S05.CHALLENGE_02;

public abstract class PaymentMethod implements Authenticable {
    protected double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();

    public void showSummary() {
        System.out.println("📄 Type: " + this.getClass().getSimpleName() + " - Amount: $" + amount);
    }

}


