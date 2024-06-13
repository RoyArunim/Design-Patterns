package WithStrategy.Strategy;

public class CafeRideStrategy implements RideStrategy{
    @Override
    public void drive() {
        System.out.println("Ride gracefully");
    }
}
