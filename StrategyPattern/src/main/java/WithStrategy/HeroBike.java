package WithStrategy;

import WithStrategy.Strategy.NormalRideStrategy;

public class HeroBike extends Bike {
    public HeroBike() {
        super(new NormalRideStrategy());
    }
}
