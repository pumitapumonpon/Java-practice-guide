import components.*;

public class Patrol extends EmergencyUnit {
    private GPS gps;
    private Siren siren;
    private Operator operator;

    public Patrol(String name, Operator operator) {
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
        System.out.println("🚓 Patrol responding to a public safety situation.");
    }
}
