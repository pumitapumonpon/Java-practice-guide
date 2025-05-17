package S05.CHALLENGE_02;

public class CashPayment extends PaymentMethod {

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public boolean authenticate() {
        return true; 
    }

    @Override
    public void processPayment() {
        System.out.println("💵 Processing cash payment of $" + amount);
    }

    

}
