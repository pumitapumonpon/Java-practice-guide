package S01.CHALLENGE_02;

public class Ticket {
    private String eventName;
    private double price;
 
    public Ticket(String eventName, double price) {
        this.eventName = eventName;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Evento: " + eventName + " | Precio: $" + price);
    }
}


