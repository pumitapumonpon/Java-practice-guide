package S01.CHALLENGE_02;

public class Main {
    public static void main(String[] args) {
        Ticket e1 = new Ticket("Obra de Teatro", 450.0);
        TicketRecord e2 = new TicketRecord("Concierto de Jazz", 320.5);
        Ticket e3 = new Ticket("Película de terror", 72.75);
        TicketRecord e4 = new TicketRecord("Ballet clásico", 899.90);

        e1.showInfo();
        e2.showInfo();
        e3.showInfo();
        e4.showInfo();
    }
}
