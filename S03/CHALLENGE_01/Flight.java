package S03.CHALLENGE_01;

public class Flight {
    final String flightCode;
    String destination;
    String departureTime;
    Passenger reservedSeat;

    public Flight (String flightCode, String destiny, String departureTime) {
        this.flightCode = flightCode;
        this.destination = destiny;
        this.departureTime = departureTime;
        this.reservedSeat = null;
    }

    
    public boolean reserveSeat(Passenger p) {
        if (reservedSeat == null) {
            this.reservedSeat = p;
            return true;
        }
        return false;
    }


    public boolean reserveSeat(String name, String passport) {
        return reserveSeat(new Passenger(name, passport));
    }

    void cancelReservation() {
        this.reservedSeat = null;
        System.out.println("❌ Canceling reservation...");
    }

    String getItinerary() {
        String passengerInfo = (this.reservedSeat != null)
            ? this.reservedSeat.getName()
            : "[No reservation]";

        return "✈️ Flight Itinerary:\n" +
            "Flight Code: " + this.flightCode + "\n" +
            "Destination: " + this.destination + "\n" +
            "Departure Time: " + this.departureTime + "\n" +
            "Passenger: " + passengerInfo + "\n";
    }
}
