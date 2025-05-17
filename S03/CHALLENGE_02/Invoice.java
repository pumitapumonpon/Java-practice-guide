package S03.CHALLENGE_02;

import java.util.Optional;

public class Invoice {
    private double amount;
    private String description;
    private Optional<String> rfc;

    public Invoice(double amount, String description, String rfc) {
        this.amount = amount;
        this.description = description;
        this.rfc = (rfc != null) ? Optional.of(rfc) : Optional.empty();
        // Another option: this.rfc = Optional.ofNullable(rfc);
    }
   
    public String getSummary() {
        String rfc = this.rfc.isPresent() ? this.rfc.get() : "[Not provided]";
        // Another option: String rfc = this.rfc.orElse("[Not provided]");

        return " -- 📄 Invoice generated --\n" +
            "Description: " + this.description + "\n" +
            "Amount: $" + this.amount + "\n" +
            "RFC: " + rfc + "\n";
    } 
}
