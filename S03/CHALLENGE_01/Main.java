package S03.CHALLENGE_01;

public class Main {
    public static void main(String[] args) {
        // Create a passenger and a flight
        Passenger passenger1 = new Passenger("Ana Martinez", "X1234567");
        Flight flight1 = new Flight("UX123", "Paris", "14:30");

        // Reserve a seat using a Passenger object
        if (flight1.reserveSeat(passenger1)) {
            System.out.println("✅ Reservation successful.\n");
        }

        // Show itinerary
        System.out.println(flight1.getItinerary());

        // Cancel reservation
        flight1.cancelReservation();

        // Show itinerary again
        System.out.println(flight1.getItinerary());

        // Reserve a seat using name and passport (overloaded method)
        flight1.reserveSeat("Mario Gonzalez", "Z7654321");

        // Show final itinerary
        System.out.println(flight1.getItinerary());
        
    }
}
