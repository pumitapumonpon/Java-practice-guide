package components;

public class Operator {
    private String name;

    public Operator(String name) {
        this.name = name;
    }

    public void report() {
        System.out.println("👷 Operator " + name + " reporting.");
    }
}
