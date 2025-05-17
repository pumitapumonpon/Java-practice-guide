package S04.CHALLENGE_01;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("FAC001", "Juan Pérez", 1450.0);
        Invoice invoice2 = new Invoice("FAC001", "Comercial XYZ", 1450.0);

        System.out.println(invoice1.toString());
        System.out.println(invoice2.toString());

        boolean areEqual = invoice1.equals(invoice2);
        System.out.println("Are the invoices equal?: " + areEqual);
    }
}
