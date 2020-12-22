package edu.umb.cs680.hw13;

import java.util.Observable;
import java.util.Observer;

public class ThreeDObserver implements Observer {

    public void update(Observable obsv, Object obj) {
        if (obj instanceof StockEvent) {
            StockEvent stockEvent = (StockEvent) obj;
            System.out.println(stockEvent.getQuote());
        } else if (obj instanceof DJIAEvent) {
            DJIAEvent event = (DJIAEvent) obj;
            System.out.println(event.getQuote());
        }
    }
}