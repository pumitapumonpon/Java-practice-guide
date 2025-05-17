package S03.CHALLENGE_01;

public class Passenger {
    String name;
    String passport;

    public Passenger (String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    String getName() {
        return this.name;
    }

    String getPassport() {
        return this.passport;
    }
}
