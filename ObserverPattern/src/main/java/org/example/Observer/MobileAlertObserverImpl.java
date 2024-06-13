package org.example.Observer;

import org.example.Observable.GalaxyObservableImpl;
import org.example.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String ph;
    StocksObservable observable;
    public MobileAlertObserverImpl(String ph, StocksObservable observable){
        this.ph=ph;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendMessage(ph, "hurry up product is in stock!!");
    }

    private void sendMessage(String ph, String msg){
        System.out.println("msg send to "+ph);
    }
}
