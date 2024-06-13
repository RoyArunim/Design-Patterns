package WithStrategy.Strategy;

public class OffroadRideStrategy implements RideStrategy{
    @Override
    public void drive() {
        System.out.println("Why are you on flat ground");
    }
}
