package org.example;

import org.example.Observable.GalaxyObservableImpl;
import org.example.Observable.IphoneObservableImpl;
import org.example.Observable.StocksObservable;
import org.example.Observer.EmailAlertObserverImpl;
import org.example.Observer.MobileAlertObserverImpl;
import org.example.Observer.NotificationAlertObserver;

public class AmazonStore {
    public static void main(String[] args){
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();
        StocksObservable galaxyStockObservable = new GalaxyObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("royarunimb12@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("arunim.roy@philips.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("8825451613",iphoneStockObservable);
        NotificationAlertObserver observer4 = new MobileAlertObserverImpl("8825451613",galaxyStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        galaxyStockObservable.add(observer3);
        //galaxyStockObservable.add(observer4);
        iphoneStockObservable.setStockCount(10);

    }
}
