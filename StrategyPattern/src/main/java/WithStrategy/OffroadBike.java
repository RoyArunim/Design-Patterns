package WithStrategy;

import WithStrategy.Strategy.OffroadRideStrategy;


public class OffroadBike extends Bike{
    public OffroadBike() {
        super(new OffroadRideStrategy());
    }
}
