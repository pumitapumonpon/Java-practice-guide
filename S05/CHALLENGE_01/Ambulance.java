import components.*;

public class Ambulance extends EmergencyUnit {
    private GPS gps;
    private Siren siren;
    private Operator operator;

    public Ambulance(String name, Operator operator) {
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
        System.out.println("🩺 Ambulance en route to the nearest hospital.");
    }
}
