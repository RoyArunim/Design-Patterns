package org.example;

import WithStrategy.Bike;
import WithStrategy.CafeBike;
import WithStrategy.HeroBike;

public class Main {
    public static void main(String[] args){
        Bike bike=new CafeBike();
        bike.ride();

        Bike bike2=new HeroBike();
        bike2.ride();

    }
}