package WithStrategy.Strategy;

public class NormalRideStrategy implements RideStrategy{
    @Override
    public void drive() {
        System.out.println("This is a normal riding experience");
    }
}
