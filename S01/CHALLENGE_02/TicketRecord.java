package S01.CHALLENGE_02;

//Record use
public record TicketRecord(String nombreEvento, double precioEntrada) {
    public void showInfo() {
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precioEntrada);
    }
}


