package WithStrategy;

import WithStrategy.Strategy.RideStrategy;

public class Bike {
    RideStrategy rideobj;
    public Bike(RideStrategy rideobj){
        this.rideobj=rideobj;
    }

    public void ride(){
        rideobj.drive();
    }
}
