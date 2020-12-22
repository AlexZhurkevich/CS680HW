package edu.umb.cs680.hw13;

import java.util.LinkedList;


public class DJIAQuoteMulticast {
    
    private float quote;
    private LinkedList<DJIAQuoteObserver> observers;

    public DJIAQuoteMulticast() {
        this.observers = new LinkedList<DJIAQuoteObserver>();
    }

    public void addObserver(DJIAQuoteObserver observer){
        this.observers.add(observer);
    }

    public void changeQuote(float quote) {
		this.quote = quote;
		notifyObserver(new DJIAEvent(quote));
    }
    
    public void notifyObserver(DJIAEvent event) {
		for (DJIAQuoteObserver observer : observers) {
			observer.updateDJIA(event);
		}
    }

    public float getQuote(){
        return this.quote;
    }
}