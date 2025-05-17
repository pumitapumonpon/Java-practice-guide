import components.*;

public class FireTruck extends EmergencyUnit {
    private GPS gps;
    private Siren siren;
    private Operator operator;

    public FireTruck(String name, Operator operator) {
        super(name);
        this.gps = new GPS();
        this.siren = new Siren();
        this.operator = operator;
    }

    public void startOperation() {
        super.activateUnit();
        gps.locate();
        siren.activateSiren();
        operator.report();
        respond();
    }

    @Override
    public void respond() {
        System.out.println("🔥 Fire truck responding to a structural fire.");
    }

    
}
