public class CentralDispatch {
    public static void main(String[] args) {
        Ambulance ambulance = new Ambulance("Ambulance", new components.Operator("Juan"));
        Patrol patrol = new Patrol("Patrol", new components.Operator("Laura"));
        FireTruck fireTruck = new FireTruck("Fire Truck", new components.Operator("Marco"));

        ambulance.startOperation();
        System.out.println();
        patrol.startOperation();
        System.out.println();
        fireTruck.startOperation(); 
    }
}
