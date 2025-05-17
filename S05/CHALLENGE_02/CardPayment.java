package S05.CHALLENGE_02;

public class CardPayment extends PaymentMethod {
    private double availableBalance;

    public CardPayment(double amount, double availableBalance) {
        super(amount);
        this.availableBalance = availableBalance;
    }

    @Override
    public boolean authenticate() {
        return availableBalance >= amount;
    }

    @Override
    public void processPayment() {
        System.out.println("💳 Processing card payment of $" + amount);
    }

}
