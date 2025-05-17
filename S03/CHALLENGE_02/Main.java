package S03.CHALLENGE_02;

public class Main {
    public static void main(String[] args) {
        Invoice invoiceWithRFC = new Invoice(2500.0, "Consulting Service", "ABCC010101XYZ");
        Invoice invoiceWithoutRFC = new Invoice(1800.0, "Equipment Repair", null);

        System.out.println(invoiceWithRFC.getSummary());
        System.out.println(invoiceWithoutRFC.getSummary());
    }
}
