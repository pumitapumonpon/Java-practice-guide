package S04.CHALLENGE_02;

import java.util.Objects;

public class FiscalAccount {
    private String rfc;
    private double availableBalance;

    public FiscalAccount (String rfc, double availableBalance) {
        this.rfc = rfc;
        if (availableBalance < 0) {
            System.out.println("Balance cannot be negative.");
            this.availableBalance = 0;
        } else this.availableBalance = availableBalance;
    }

    String getRFC() {
        return this.rfc;
    }

    double getAvailableBalance() {
        return this.availableBalance;
    }

    public boolean validateRFC(TaxDeclaration d) {
        return Objects.equals(this.rfc, d.taxpayerRFC());
    } 
}
