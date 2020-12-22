package edu.umb.cs680.hw13;

import java.util.HashMap;
import java.util.Observable;

public class StockQuoteObservable extends Observable {

    private HashMap<String , Float > map; 

    public StockQuoteObservable() {
        this.map = new HashMap<String, Float>();
    }

    public void changeQuote(String ticker, Float quote){
        this.map.put(ticker, quote);
        setChanged();
        notifyObservers(new StockEvent(ticker, quote));
    }

    public HashMap<String, Float> getMap() {
		return this.map;
	}
}