package S04.CHALLENGE_01;

public class Invoice {
    private String folio;
    private String client;
    private double total;
    

    public Invoice (String folio, String client, Double total) {
        this.folio = folio;
        this.client = client;
        this.total = total;
    }

    @Override
    public String toString() {
        return "🧾 Invoice [folio=" + this.folio + ", client=" + this.client + ", total=$" + this.total + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto en memoria
        if (!(obj instanceof Invoice)) return false;
        //Another option: if (obj == null || getClass() != obj.getClass()) return false;

        Invoice other = (Invoice) obj;
        return this.folio.equals(other.folio);
    }

    @Override
    public int hashCode() {
        return folio.hashCode();
    }


}
