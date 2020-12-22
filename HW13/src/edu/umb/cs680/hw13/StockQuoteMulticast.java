package edu.umb.cs680.hw13;

import java.util.HashMap;
import java.util.LinkedList;

public class StockQuoteMulticast {

    private HashMap<String, Float> map;
    private LinkedList<StockQuoteObserver> observers;

    public StockQuoteMulticast(){
        this.map = new HashMap<String, Float>();
        this.observers = new LinkedList<StockQuoteObserver>();
    }

    public void notifyObserver(StockEvent stockEvent){
        for (StockQuoteObserver observer : observers){
            observer.updateStock(stockEvent);
        }
    }

    public void changeQuote(String ticker, float quote){
        this.map.put(ticker, quote);
        notifyObserver(new StockEvent(ticker, quote));
    }

    public HashMap<String, Float> getMap() {
		return this.map;
	}

    public void addObserver(StockQuoteObserver observer){
        this.observers.add(observer);
    }
}