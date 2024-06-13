package WithStrategy;

import WithStrategy.Strategy.CafeRideStrategy;

public class CafeBike extends Bike{
    public CafeBike() {
        super(new CafeRideStrategy());
    }
}
