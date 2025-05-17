package S04.CHALLENGE_02;

public class Main {
    public static void main(String[] args) {
        TaxDeclaration declaration = new TaxDeclaration("XAXX010101000", 8700.0);
        FiscalAccount account = new FiscalAccount("XAXX010101000", 9500.0);

        System.out.println("📄 Declaration submitted by RFC: " + declaration.taxpayerRFC() +
                           " for $" + declaration.declaredAmount());
        System.out.println("🏦 Registered fiscal account with RFC: " + account.getRFC() +
                           ", available balance: $" + account.getAvailableBalance());

        boolean isValid = account.validateRFC(declaration);
        System.out.println("✅ Is RFC valid for this account?: " + isValid);
    }
    
}
