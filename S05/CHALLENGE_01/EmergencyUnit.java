
public abstract class EmergencyUnit {
    protected String name;

    public EmergencyUnit(String name) {
        this.name = name;
    }

    public abstract void respond();

    public void activateUnit() {
        System.out.println("🚨 Activating unit: " + name);
    }
}
